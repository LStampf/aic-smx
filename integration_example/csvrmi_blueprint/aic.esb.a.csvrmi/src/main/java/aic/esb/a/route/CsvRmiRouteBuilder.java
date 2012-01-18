package aic.esb.a.route;

import java.util.List;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.CsvDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gerald Schermann
 * 
 * In the configure-method of CsvRmiRouteBuilder a route is specified in the
 * Java DSL.
 * 
 * See the comments for further information.
 */
public class CsvRmiRouteBuilder extends RouteBuilder {

    private Logger logger = LoggerFactory.getLogger(CsvRmiRouteBuilder.class);
        
    public void configure() {
        logger.info("start configuring camel route");
        
        //for unmarshalling the input data, we have to specify with what kind
        // of input data format we have to deal with
        CsvDataFormat csv = new CsvDataFormat();
        csv.setDelimiter(";");
        
        this.onException(Exception.class).handled(true).marshal(csv).to("log:converting-exception");
        
        //for every file dropped in our input folder the processing starts
        from("file:esb-example/input")
                // first, we unmarshal the content into a list of lists
                .unmarshal(csv) 
                // here, we split into single lists, were for each list the route is processed
                .split(body(List.class)) 
                // the list gets converted into a java-object InvestmentForm
                .to("bean:handleCsv?method=toInvestmentForm") 
                // we call a remote-method for each InvestmentObject
                .to("rmi://localhost:10130/PrivateBankingService?method=addInvestmentForm") 
                // the return value of the remote-call is logged
                .to("log:output"); 
                        
        logger.info("finished configuring camel route");
    }
}
