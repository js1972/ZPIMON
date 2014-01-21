
package adaptermessagemonitoringvi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.adapterframework.server.mdt.aii.sap.com.MessageSearchReturnValue;


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
 *         &lt;element name="Response" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}MessageSearchReturnValue"/>
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
    "response"
})
@XmlRootElement(name = "getMessagesByKeysResponse")
public class GetMessagesByKeysResponse {

    @XmlElement(name = "Response", required = true, nillable = true)
    protected MessageSearchReturnValue response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchReturnValue }
     *     
     */
    public MessageSearchReturnValue getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchReturnValue }
     *     
     */
    public void setResponse(MessageSearchReturnValue value) {
        this.response = value;
    }

}
