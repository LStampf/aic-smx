package at.ac.tuwien.infosys.aic11.integrate_legacy.corba;

import at.ac.tuwien.infosys.aic11.integrate_legacy.converter.InvestmentFormConverter;
import at.ac.tuwien.infosys.aic11.integrate_legacy.entities.InvestmentForm;
import java.io.InputStream;
import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CORBA client, does the actual CORBA call.
 * @author Dominik Rauch
 */
public class CorbaClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvestmentFormConverter.class);
    private static final String[] ORB_ARGS = new String[]{"-ORBInitialHost", "localhost", "-ORBInitialPort", String.valueOf(1050)};

    public boolean doCorbaCall(final InvestmentForm investmentForm) throws org.omg.CORBA.ORBPackage.InvalidName, NotFound, CannotProceed, InvalidName {
        try {
            // Create and initialize ORB
            final ORB orb = ORB.init(ORB_ARGS, null);
            
            // Get root naming context
            final org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            // Use NamingContextExt instead of NamingContext. This is
                    // part of the Interoperable Naming Service (INS) spec.
            final NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Resolve the Object Reference for Investment
            final String name = "Investment";
            final Investment invImpl = InvestmentHelper.narrow(ncRef.resolve_str(name));
            LOGGER.debug("Obtained a handle on server object: " + invImpl);

            // Do actual CORBA call
            final int result = invImpl.placeInvestment(investmentForm.getName(), investmentForm.getMin_deposit(), investmentForm.getMin_duration(), investmentForm.getRevenue());
            return result == 0;
        } catch(Exception ex) {
            LOGGER.error("CORBA-ERROR", ex);
            return false;
        }
    }
}
