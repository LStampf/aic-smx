package at.ac.tuwien.infosys.aic11.integrate_legacy.converter;

import at.ac.tuwien.infosys.aic11.integrate_legacy.entities.InvestmentForm;
import at.ac.tuwien.infosys.aic11.integrate_legacy.entities.RiskLevel;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper-class, converts a CSV row into a domain object
 * 
 * @author Gerald Schermann
 */
public class InvestmentFormConverter  {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(InvestmentFormConverter.class);
    
    public InvestmentForm toInvestmentForm(final List data) {
        final InvestmentForm investmentForm = new InvestmentForm();
        investmentForm.setId(data.get(0).toString());
        investmentForm.setName(data.get(1).toString());
        investmentForm.setDescription(data.get(2).toString());
        investmentForm.setMin_duration(Integer.valueOf(data.get(3).toString()));
        investmentForm.setRisklevel(RiskLevel.values()[Integer.valueOf(data.get(4).toString())]);
        investmentForm.setMin_deposit(Double.valueOf(data.get(5).toString()));
        investmentForm.setRevenue(Integer.valueOf(data.get(6).toString()));
        return investmentForm;
    }
}
