
package adaptermessagemonitoringvi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfAttributeMetadata;


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
 *         &lt;element name="Response" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}ArrayOfAttributeMetadata"/>
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
@XmlRootElement(name = "getUserDefinedSearchExtractorsResponse")
public class GetUserDefinedSearchExtractorsResponse {

    @XmlElement(name = "Response", required = true, nillable = true)
    protected ArrayOfAttributeMetadata response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeMetadata }
     *     
     */
    public ArrayOfAttributeMetadata getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeMetadata }
     *     
     */
    public void setResponse(ArrayOfAttributeMetadata value) {
        this.response = value;
    }

}
