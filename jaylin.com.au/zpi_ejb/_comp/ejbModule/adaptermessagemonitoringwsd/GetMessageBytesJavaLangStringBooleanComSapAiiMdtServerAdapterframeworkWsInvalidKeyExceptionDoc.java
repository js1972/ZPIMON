package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "getMessageBytesJavaLangStringBoolean_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException")
public class GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException _GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  public GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo){
    super(message);
    this._GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo, Throwable cause){
    super(message, cause);
    this._GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException getFaultInfo(){
    return this._GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
  }

}
