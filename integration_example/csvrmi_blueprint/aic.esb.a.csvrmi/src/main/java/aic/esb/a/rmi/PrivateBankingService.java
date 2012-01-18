package aic.esb.a.rmi;

import aic.esb.a.entities.InvestmentForm;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * 
 * @author Gerald Schermann
 * 
 * The server's remote interface
 */
public interface PrivateBankingService extends Remote {
    
    int addInvestmentForm(InvestmentForm form) throws RemoteException;
    
    ArrayList<InvestmentForm> getInvestmentForms() throws RemoteException;

}
