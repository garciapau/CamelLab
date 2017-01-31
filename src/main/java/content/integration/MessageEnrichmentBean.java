package content.integration;

/**
 * Created by u6023035 on 24/01/2017.
 */
public class MessageEnrichmentBean {
    public static String map(String custom) {
        System.out.println("\t--> Content enrichment for: "
                + custom.substring(custom.indexOf("user=")+6, custom.indexOf(">")-1)
        );
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + custom.replaceAll("james", "JAMES");
    }
}
