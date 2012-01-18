package at.ac.tuwien.infosys.aic11.integrate_legacy.route;

import java.util.List;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.CsvDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CSV file to CORBA route, specified in Java DSL.
 * 
 * @author Dominik Rauch
 */
public class CsvToCorbaRouteBuilder extends RouteBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(CsvToCorbaRouteBuilder.class);
    
    @Override
    public void configure() throws Exception {
        LOGGER.info("Configuring CsvToCorba Camel route...");
        
        // Kind of input data we deal with
        CsvDataFormat csv = new CsvDataFormat();
        csv.setDelimiter(";");
        
        // Set exception handler (for testing purposes: log exception)
        this.onException(Exception.class).handled(true).marshal(csv).to("log:converting-exception");
        
        // Build route
        from("file:esb-example/input") // for every file dropped in this folder
        .unmarshal(csv) // unmarshal content into a list of lists
        .split(body(List.class)) // split list, do subsequent route for each of the lists
        .to("bean:handleCsv?method=toInvestmentForm") // convert CSV to internal entities (handleCsv is defined in blueprint.xml => call to InvestmentFormConverter
        .to("bean:doCorbaCall?method=doCorbaCall")
        .to("log:output"); // log return value of CORBA call
        
        LOGGER.info("Configuring CsvToCorba Camel route finished.");
    }
}
