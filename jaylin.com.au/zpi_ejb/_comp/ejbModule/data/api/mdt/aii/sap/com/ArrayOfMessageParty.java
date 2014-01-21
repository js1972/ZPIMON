
package data.api.mdt.aii.sap.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessageParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageParty" type="{urn:com.sap.aii.mdt.api.data}MessageParty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageParty", propOrder = {
    "messageParty"
})
public class ArrayOfMessageParty {

    @XmlElement(name = "MessageParty", nillable = true)
    protected List<MessageParty> messageParty;

    /**
     * Gets the value of the messageParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageParty }
     * 
     * 
     */
    public List<MessageParty> getMessageParty() {
        if (messageParty == null) {
            messageParty = new ArrayList<MessageParty>();
        }
        return this.messageParty;
    }

}
