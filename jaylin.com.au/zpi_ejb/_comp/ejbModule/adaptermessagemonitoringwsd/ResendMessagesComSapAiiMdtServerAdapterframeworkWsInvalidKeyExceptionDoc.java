package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "resendMessages_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException")
public class ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException _ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  public ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo){
    super(message);
    this._ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo, Throwable cause){
    super(message, cause);
    this._ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException getFaultInfo(){
    return this._ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
  }

}
