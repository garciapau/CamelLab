package content.integration.model;

import javax.xml.bind.annotation.*;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
/**
 * Created by u6023035 on 27/01/2017.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@CsvRecord(separator = ",", crlf = "UNIX")
public class person {
    @XmlAttribute
    @DataField(pos = 1)
    private String user;
    @XmlElement
    @DataField(pos = 2)
    private String firstName;
    @XmlElement
    @DataField(pos = 3)
    private String lastName;
    @XmlElement
    @DataField(pos = 4)
    private String city;
}
