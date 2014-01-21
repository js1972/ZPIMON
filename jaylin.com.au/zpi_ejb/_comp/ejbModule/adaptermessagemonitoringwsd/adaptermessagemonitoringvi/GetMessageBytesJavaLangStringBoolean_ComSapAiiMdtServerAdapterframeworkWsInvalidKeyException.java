
package adaptermessagemonitoringwsd.adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException;

public class GetMessageBytesJavaLangStringBoolean_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException
    extends JAXBElement<InvalidKeyException>
{

    protected final static QName NAME = new QName("urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", "getMessageBytesJavaLangStringBoolean_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException");

    public GetMessageBytesJavaLangStringBoolean_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException(InvalidKeyException value) {
        super(NAME, ((Class) InvalidKeyException.class), null, value);
    }

    public GetMessageBytesJavaLangStringBoolean_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException() {
        super(NAME, ((Class) InvalidKeyException.class), null, null);
    }

}
