
package ws.adapterframework.server.mdt.aii.sap.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBusinessAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBusinessAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessAttribute" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}BusinessAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBusinessAttribute", propOrder = {
    "businessAttribute"
})
public class ArrayOfBusinessAttribute {

    @XmlElement(name = "BusinessAttribute", nillable = true)
    protected List<BusinessAttribute> businessAttribute;

    /**
     * Gets the value of the businessAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessAttribute }
     * 
     * 
     */
    public List<BusinessAttribute> getBusinessAttribute() {
        if (businessAttribute == null) {
            businessAttribute = new ArrayList<BusinessAttribute>();
        }
        return this.businessAttribute;
    }

}
