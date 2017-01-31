package content.integration.filter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by u6023035 on 24/01/2017.
 */
public class MessageFilter implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("Filtering file: "
                + exchange.getIn().getHeader("CamelFileName")
        );
        String name = exchange.getIn().getHeader("personName", String.class);
        if ("pau".equalsIgnoreCase(name)) {
            exchange.getOut().setFault(true);
            System.out.println("--> Message discarded for person: "
                    + exchange.getIn().getHeader("personName", String.class)
            );
        }
    }
}
