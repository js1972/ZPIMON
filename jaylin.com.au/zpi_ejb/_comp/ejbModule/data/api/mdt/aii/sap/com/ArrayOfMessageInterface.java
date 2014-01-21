
package data.api.mdt.aii.sap.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessageInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageInterface" type="{urn:com.sap.aii.mdt.api.data}MessageInterface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageInterface", propOrder = {
    "messageInterface"
})
public class ArrayOfMessageInterface {

    @XmlElement(name = "MessageInterface", nillable = true)
    protected List<MessageInterface> messageInterface;

    /**
     * Gets the value of the messageInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageInterface }
     * 
     * 
     */
    public List<MessageInterface> getMessageInterface() {
        if (messageInterface == null) {
            messageInterface = new ArrayList<MessageInterface>();
        }
        return this.messageInterface;
    }

}
