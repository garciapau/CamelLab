package content.integration.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by u6023035 on 24/01/2017.
 */
public class LogProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("Processing file: "
                + exchange.getIn().getHeader("CamelFileName") + "\n"
                + exchange.getIn().getBody(String.class)
        );
    }
}
