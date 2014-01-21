package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "cancelMessages_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException")
public class CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException _CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  public CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo){
    super(message);
    this._CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException faultInfo, Throwable cause){
    super(message, cause);
    this._CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.InvalidKeyException getFaultInfo(){
    return this._CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
  }

}
