
package adaptermessagemonitoringwsd.adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException;

public class GetLogEntries_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException
    extends JAXBElement<InvalidKeyException>
{

    protected final static QName NAME = new QName("urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", "getLogEntries_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException");

    public GetLogEntries_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException(InvalidKeyException value) {
        super(NAME, ((Class) InvalidKeyException.class), null, value);
    }

    public GetLogEntries_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException() {
        super(NAME, ((Class) InvalidKeyException.class), null, null);
    }

}
