package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "getMessageBytesJavaLangStringIntBoolean_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException")
public class GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException _GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  public GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo){
    super(message);
    this._GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo, Throwable cause){
    super(message, cause);
    this._GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException getFaultInfo(){
    return this._GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
  }

}
