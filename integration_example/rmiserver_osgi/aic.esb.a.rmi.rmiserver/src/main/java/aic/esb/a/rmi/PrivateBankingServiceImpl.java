/**
 * @author Gerald Schermann
 */
package aic.esb.a.rmi;

import aic.esb.a.entities.InvestmentForm;
import aic.esb.a.entities.RiskLevel;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * PrivateBankingServiceImpl provides the implementation for the servers
 * remote-interface.
 */
public class PrivateBankingServiceImpl implements PrivateBankingService {
    private Logger logger = Logger.getLogger(PrivateBankingServiceImpl.class.getName());
    
    @Override
    public int addInvestmentForm(InvestmentForm form) throws RemoteException {
        logger.info("addInvestmentForm called (" + form.getName() +  ")");
        
        /* Here should be some business logic
         * ... 
         */
        
        return Integer.valueOf(form.getId());
    }

    @Override
    public ArrayList<InvestmentForm> getInvestmentForms() throws RemoteException {
        logger.info("getInvestmentForms called");
        ArrayList<InvestmentForm> list = new ArrayList<InvestmentForm>();
        
        InvestmentForm a = new InvestmentForm();
        a.setId("1");
        a.setName("deposit account");
        a.setMin_deposit(0.0);
        a.setMin_duration(0);
        a.setRevenue(1);
        a.setRisklevel(RiskLevel.Low);
        
        InvestmentForm b = new InvestmentForm();
        b.setId("2");
        b.setName("bond fund");
        b.setMin_deposit(500.0);
        b.setMin_duration(2);
        b.setRevenue(4);
        b.setRisklevel(RiskLevel.Medium);
        
        InvestmentForm c = new InvestmentForm();
        c.setId("3");
        c.setName("Hedgefond stock");
        c.setMin_deposit(1000.0);
        c.setMin_duration(1);
        c.setRevenue(20);
        c.setRisklevel(RiskLevel.Speculative);
        
        list.add(a);
        list.add(b);
        list.add(c);
        
        return list;
    }
}
