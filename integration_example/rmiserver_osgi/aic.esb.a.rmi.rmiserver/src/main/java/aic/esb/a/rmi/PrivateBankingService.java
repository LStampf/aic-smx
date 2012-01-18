/**
 * @author Gerald Schermann
 */
package aic.esb.a.rmi;

import aic.esb.a.entities.InvestmentForm;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * This interface is the servers remote-interface. 
 */
public interface PrivateBankingService extends Remote {
    
    int addInvestmentForm(InvestmentForm form) throws RemoteException;
    
    ArrayList<InvestmentForm> getInvestmentForms() throws RemoteException;

}
