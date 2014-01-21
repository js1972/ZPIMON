
package adaptermessagemonitoringwsd.adaptermessagemonitoringvi;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException;

public class GetMessageBytesJavaLangStringIntBoolean_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException
    extends JAXBElement<InvalidKeyException>
{

    protected final static QName NAME = new QName("urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", "getMessageBytesJavaLangStringIntBoolean_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException");

    public GetMessageBytesJavaLangStringIntBoolean_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException(InvalidKeyException value) {
        super(NAME, ((Class) InvalidKeyException.class), null, value);
    }

    public GetMessageBytesJavaLangStringIntBoolean_ComSapAiiMdtServerAdapterframeworkWsInvalidKeyException() {
        super(NAME, ((Class) InvalidKeyException.class), null, null);
    }

}
