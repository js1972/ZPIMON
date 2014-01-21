
package ws.adapterframework.server.mdt.aii.sap.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdminActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdminActionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdminActionResult" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}AdminActionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdminActionResult", propOrder = {
    "adminActionResult"
})
public class ArrayOfAdminActionResult {

    @XmlElement(name = "AdminActionResult", nillable = true)
    protected List<AdminActionResult> adminActionResult;

    /**
     * Gets the value of the adminActionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminActionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminActionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdminActionResult }
     * 
     * 
     */
    public List<AdminActionResult> getAdminActionResult() {
        if (adminActionResult == null) {
            adminActionResult = new ArrayList<AdminActionResult>();
        }
        return this.adminActionResult;
    }

}
