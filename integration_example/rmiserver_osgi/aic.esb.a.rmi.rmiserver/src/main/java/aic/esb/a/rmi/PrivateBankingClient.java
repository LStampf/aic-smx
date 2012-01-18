/**
 * @author Gerald Schermann
 */
package aic.esb.a.rmi;

import aic.esb.a.entities.InvestmentForm;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * This small programm can be used to test the functionality of 
 * PrivateBankingService.
 * 
 * Note: The bundle (RMIServer) has to be deployed first, otherwise no
 * connection could be established.
 */
public class PrivateBankingClient {

    private PrivateBankingClient() throws NotBoundException {
        try {
           System.out.println("Getting registry");
            Registry registry = LocateRegistry.getRegistry("localhost", 10130);

            System.out.println("Lookup service");
            PrivateBankingService s = (PrivateBankingService) registry.lookup("PrivateBankingService");

            System.out.println("Invoking RMI ...");
            for(InvestmentForm a : s.getInvestmentForms())
                System.out.println(a.toString());
            

        } catch (RemoteException ex) {
           System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        new PrivateBankingClient();
    }
}
