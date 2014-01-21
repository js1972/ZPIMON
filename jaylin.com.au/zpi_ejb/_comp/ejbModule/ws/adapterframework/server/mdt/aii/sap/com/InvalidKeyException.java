
package ws.adapterframework.server.mdt.aii.sap.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidKeyException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidKeyException">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.sap.aii.mdt.server.adapterframework.ws}OperationFailedException">
 *       &lt;sequence>
 *         &lt;element name="messageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidKeyException", propOrder = {
    "messageKey"
})
public class InvalidKeyException
    extends OperationFailedException
{

    @XmlElementRef(name = "messageKey", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", type = JAXBElement.class)
    protected JAXBElement<String> messageKey;

    /**
     * Gets the value of the messageKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageKey() {
        return messageKey;
    }

    /**
     * Sets the value of the messageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageKey(JAXBElement<String> value) {
        this.messageKey = ((JAXBElement<String> ) value);
    }

}
