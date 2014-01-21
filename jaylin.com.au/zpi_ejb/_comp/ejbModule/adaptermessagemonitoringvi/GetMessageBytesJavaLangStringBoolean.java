
package adaptermessagemonitoringvi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageKey",
    "archive"
})
@XmlRootElement(name = "getMessageBytesJavaLangStringBoolean")
public class GetMessageBytesJavaLangStringBoolean {

    @XmlElement(required = true, nillable = true)
    protected String messageKey;
    protected boolean archive;

    /**
     * Gets the value of the messageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageKey() {
        return messageKey;
    }

    /**
     * Sets the value of the messageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageKey(String value) {
        this.messageKey = value;
    }

    /**
     * Gets the value of the archive property.
     * 
     */
    public boolean isArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     */
    public void setArchive(boolean value) {
        this.archive = value;
    }

}
