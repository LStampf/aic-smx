package at.ac.tuwien.infosys.aic11.legacy;

import at.ac.tuwien.infosys.aic11.integrate_legacy.corba.Investment;
import at.ac.tuwien.infosys.aic11.integrate_legacy.corba.InvestmentHelper;
import at.ac.tuwien.infosys.aic11.integrate_legacy.corba.InvestmentPOA;
import java.io.InputStream;
import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CORBA server (= legacy application)
 * @author Dominik Rauch
 */
public class App extends InvestmentPOA {

    private static final Logger log = LoggerFactory.getLogger(App.class.getName());
    private static final String ORB_PROPS = "sunorb.properties";

    @Override
    public int placeInvestment(String name, double minDeposit, int minDuration, int revenue) {
        log.warn("GOT INVESTMENT: " + name + " [min deposit: " + minDeposit + ", min duration: " + minDuration + ", revenue: " + revenue + "]");
        return 0;
    }

    public static void main(String[] args) throws Exception {
        final Thread servantThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Create and initialize ORB
                    log.info("Loading orb.properties: " + ORB_PROPS);
                    final InputStream is = this.getClass().getResourceAsStream("/" + ORB_PROPS);
                    final Properties props = new Properties();
                    props.load(is);

                    log.info("Launching ORB with properties: " + props);
                    final ORB orb = ORB.init((String[]) null, props);
                    
                    // Get reference to RootPOA and activate the POAManager
                    final POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
                    rootpoa.the_POAManager().activate();

                    // Create servant and register it with ORB
                    final App impl = new App();
                    log.info("InvestmentServant created " + impl);

                    // Get object reference from the servant
                    final org.omg.CORBA.Object ref = rootpoa.servant_to_reference(impl);
                    final Investment href = InvestmentHelper.narrow(ref);

                    // Start ORB daemon
                    startOrbd(props.getProperty("orbd.port"));
                    Thread.sleep(2000);

                    // Get root naming context
                    // NameService invokes the name service
                    final org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

                    // Use NamingContextExt instead of NamingContext. This is
                    // part of the Interoperable Naming Service (INS) spec.
                    final NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

                    // Bind the Object Reference in Naming
                    final String name = "Investment";
                    final NameComponent[] path = ncRef.to_name(name);
                    ncRef.rebind(path, href);
                    log.info("InvestmentImpl - ref rebound to: " + ncRef);

                    log.info("InvestmentServer ready and waiting ...");

                    // Wait for invocations from clients
                    orb.run();
                } catch (Exception e) {
                    log.error("ERROR: ", e);
                }
                
                log.info("InvestmentServer exiting ...");
            }
        });

        servantThread.start();
    }

    private static void startOrbd(final String port) {
        Thread orbdThread = new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("Starting ORB daemon on port: " + port);
                com.sun.corba.se.impl.activation.ORBD.main(new String[]{"-ORBInitialPort", port, "-ORBInitialHost", "localhost"});
            }
        });
        
        orbdThread.setDaemon(true);
        orbdThread.start();
        log.info("ORB daemon launched");
    }
}
