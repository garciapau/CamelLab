package content.integration.marshall;

/**
 * Created by u6023035 on 24/01/2017.
 */
public class PersonMarshaller {
    public static String csvToXML(String body) {
        String[] lines = body.split("\\n");
        String[] fieldNames = lines[0].split(",");
        StringBuffer xmlDoc = new StringBuffer().append("<Attendants>");
        for (int j=1; j<lines.length; j++ )
        {
            xmlDoc.append("<person>");
            String[] fields = lines[j].split(",");
            for (int i=0; i<fields.length; i++ )
            {
                xmlDoc.append("<" + fieldNames[i].trim() + ">" + fields[i].trim() + "</" + fieldNames[i].trim() + ">");
            }
            xmlDoc.append("</person>");
        }
        return xmlDoc.append("</Attendants>").toString();
    }
}
