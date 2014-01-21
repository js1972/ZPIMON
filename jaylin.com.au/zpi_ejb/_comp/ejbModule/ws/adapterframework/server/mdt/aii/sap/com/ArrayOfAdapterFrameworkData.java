
package ws.adapterframework.server.mdt.aii.sap.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdapterFrameworkData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdapterFrameworkData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdapterFrameworkData" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}AdapterFrameworkData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdapterFrameworkData", propOrder = {
    "adapterFrameworkData"
})
public class ArrayOfAdapterFrameworkData {

    @XmlElement(name = "AdapterFrameworkData", nillable = true)
    protected List<AdapterFrameworkData> adapterFrameworkData;

    /**
     * Gets the value of the adapterFrameworkData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adapterFrameworkData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdapterFrameworkData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdapterFrameworkData }
     * 
     * 
     */
    public List<AdapterFrameworkData> getAdapterFrameworkData() {
        if (adapterFrameworkData == null) {
            adapterFrameworkData = new ArrayList<AdapterFrameworkData>();
        }
        return this.adapterFrameworkData;
    }

}
