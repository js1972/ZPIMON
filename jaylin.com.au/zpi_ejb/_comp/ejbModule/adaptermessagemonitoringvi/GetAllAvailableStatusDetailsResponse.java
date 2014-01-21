
package adaptermessagemonitoringvi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfStatusDetail;


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
 *         &lt;element name="Response" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}ArrayOfStatusDetail"/>
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
@XmlRootElement(name = "getAllAvailableStatusDetailsResponse")
public class GetAllAvailableStatusDetailsResponse {

    @XmlElement(name = "Response", required = true, nillable = true)
    protected ArrayOfStatusDetail response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatusDetail }
     *     
     */
    public ArrayOfStatusDetail getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatusDetail }
     *     
     */
    public void setResponse(ArrayOfStatusDetail value) {
        this.response = value;
    }

}
