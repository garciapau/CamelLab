package content.integration.filter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by u6023035 on 24/01/2017.
 */
public class MessageFilter implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("Filtering file: "
                + exchange.getIn().getHeader("ArticleTitle")
        );
        String name = exchange.getIn().getHeader("ArticleTitle", String.class);
        if ("Emerging Sources".equalsIgnoreCase(name)) {
            exchange.getOut().setFault(true);
            System.out.println("--> Article discarded : "
                    + exchange.getIn().getHeader("ArticleTitle", String.class)
            );
        }
    }
}
