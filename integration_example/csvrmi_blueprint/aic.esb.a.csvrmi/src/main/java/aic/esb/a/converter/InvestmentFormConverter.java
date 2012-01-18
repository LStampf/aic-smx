/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aic.esb.a.converter;

import aic.esb.a.entities.InvestmentForm;
import aic.esb.a.entities.RiskLevel;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gerald Schermann
 * 
 * This "helper-class" converts a csv-row into a object
 */
public class InvestmentFormConverter  {
    
    private Logger logger = LoggerFactory.getLogger(InvestmentFormConverter.class);
    
    public InvestmentForm toInvestmentForm(List invform) {

        logger.info("start csv conversion");
        InvestmentForm n = new InvestmentForm();
        n.setId(invform.get(0).toString());
        n.setName(invform.get(1).toString());
        n.setDescription(invform.get(2).toString());
        n.setMin_duration(Integer.valueOf(invform.get(3).toString()));
        n.setRisklevel(RiskLevel.values()[Integer.valueOf(invform.get(4).toString())]);
        n.setMin_deposit(Double.valueOf(invform.get(5).toString()));
        n.setRevenue(Integer.valueOf(invform.get(6).toString()));
        logger.info("finished csv conversion");
        
        return n;
    }
}
