package au.com.jaylin.persistence.ejbs;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import lang.java2.ArrayOfString;

import ws.adapterframework.server.mdt.aii.sap.com.AdapterFilter;
import ws.adapterframework.server.mdt.aii.sap.com.AdapterFrameworkData;
import ws.adapterframework.server.mdt.aii.sap.com.AdminActionResultMap;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfAdapterFrameworkData;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfAttributeMetadata;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfBusinessAttribute;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfIntegrationFlow;
import ws.adapterframework.server.mdt.aii.sap.com.ArrayOfStatusDetail;
import ws.adapterframework.server.mdt.aii.sap.com.Locale;
import ws.adapterframework.server.mdt.aii.sap.com.MessageSearchReturnValue;
import adaptermessagemonitoringwsd.AdapterMessageMonitoringVi;
import adaptermessagemonitoringwsd.CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
import adaptermessagemonitoringwsd.CancelMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetConnectionsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetErrorCodesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetInterfacesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
import adaptermessagemonitoringwsd.GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
import adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
import adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetMessageListComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetUserDefinedSearchFiltersComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.GetUserDefinedSearchMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import adaptermessagemonitoringwsd.ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;
import adaptermessagemonitoringwsd.ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
import au.com.jaylin.persistence.PIMessage;
import au.com.jaylin.persistence.ejbs.ApplicationPropertiesLocal;
import au.com.jaylin.persistence.ejbs.PIMessageHandler;
import au.com.jaylin.persistence.ejbs.WebServiceEndPointLocal;
import au.com.jaylin.persistence.ejbs.helpers.OperationStatus;
import au.com.jaylin.persistence.ejbs.helpers.PITimeStamp;
import au.com.jaylin.persistence.facades.PIMessageFacadeLocal;
import data.api.mdt.aii.sap.com.ArrayOfAuditLogEntryData;
import data.api.mdt.aii.sap.com.ArrayOfMessageInterface;
import data.api.mdt.aii.sap.com.ArrayOfMessageParty;
import data.api.mdt.aii.sap.com.MessageInterface;
import data.api.mdt.aii.sap.com.MessageParty;


@RunWith(MockitoJUnitRunner.class)
public class PIMessageHandlerTest {
	@Mock
	WebServiceEndPointLocal ws;
	@Mock
	PIMessageFacadeLocal piMessageFacade;
	@Mock
	ApplicationPropertiesLocal properties;
	
	@InjectMocks
	PIMessageHandler msgHandler;
		
	
	@Test
	public void testCallWSAndGetMessageList_AllMessages() {
		// setup our test double to return a message list for the web service
		when(ws.call()).thenReturn(new TestPortDoubleWithTwoSyncInterfaces());
		
		// setup time filter
		TestPortDoubleWithTwoSyncInterfaces tpd = new TestPortDoubleWithTwoSyncInterfaces();
		Date d = tpd.setDate("03-11-2013 00:00:01"); //this time will have PITimeStamp.SLIDING_WINDOW_DAYS subtracted!
		when(piMessageFacade.getPIMonMsgsLatestEndTime()).thenReturn(d);
		
		// call the method under test
		OperationStatus status = msgHandler.readPIDataAndCache();
		assertEquals("success", status.status);
		
		// check that matchMessagesToConvIdOrRefToId() never tries to lookup old messages as they are all
		// in the result-set of the WS call
		verify(piMessageFacade, never()).findPIMonMsgsById(any(String.class));
		
		// check that the 4 messages setup in our WS test double are updated
		verify(piMessageFacade, times(4)).update(any(PIMessage.class));
	}
	
	@Test
	public void testCallWSAndGetMessageList_TodaysMessagesOnly() {
		// setup our test double to return a message list for the web service
		when(ws.call()).thenReturn(new TestPortDoubleWithTwoSyncInterfaces());
		
		// setup time filter - the PITimeStamp.SLIDING_WINDOW_DAYS constant will subtract off this
		// date so add it back so that we are testing with the exact date specified in the WS test
		// double
		TestPortDoubleWithTwoSyncInterfaces tpd = new TestPortDoubleWithTwoSyncInterfaces();
		Date d = tpd.setDate("05-11-2013 00:00:01");
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_YEAR, PITimeStamp.SLIDING_WINDOW_DAYS * -1);
		when(piMessageFacade.getPIMonMsgsLatestEndTime()).thenReturn(c.getTime());
		
		// call the method under test
		OperationStatus status = msgHandler.readPIDataAndCache();
		assertEquals("success", status.status);
		
		// check that matchMessagesToConvIdOrRefToId() never tries to lookup old messages
		verify(piMessageFacade, never()).findPIMonMsgsById(any(String.class));
		
		// check that the 2 messages setup in our WS test double are for TODAY updated
		verify(piMessageFacade, times(2)).update(any(PIMessage.class));
	}
	
	@Test
	public void testCallWSAndGetMessageList_SplittingAnIflowWithFromTimeFilter() {
		// setup our test double to return a message list for the web service
		when(ws.call()).thenReturn(new TestPortDoubleWithTwoSyncInterfaces());
		
		// setup time filter
		// We choose a fixed start time that will cause the WS mock to only return the OUTBOUND
		// message - ie half of the iflow. This causes a lookup of old messages
		//
		// the PITimeStamp.SLIDING_WINDOW_DAYS constant will subtract off this
		// date so add it back so that we are testing with the exact date specified in the WS test
		// double
		TestPortDoubleWithTwoSyncInterfaces tpd = new TestPortDoubleWithTwoSyncInterfaces();
		Date d = tpd.setDate("05-11-2013 02:00:43");
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_YEAR, PITimeStamp.SLIDING_WINDOW_DAYS * -1);
		when(piMessageFacade.getPIMonMsgsLatestEndTime()).thenReturn(c.getTime());
		
		// when a lookup into old messages is made for this conversation id, return the refId of 
		// an old message that we will later check
		List<PIMessage> msgList = new ArrayList<PIMessage>();
		PIMessage m = new PIMessage();
		m.setRef_id("REF_ID FROM OLD MESSAGE");
		msgList.add(m);
		when(piMessageFacade.findPIMonMsgsById("00505682-0185-1ee3-91af-60a1b80b5975")).thenReturn(msgList);
		
		// call the method under test
		OperationStatus status = msgHandler.readPIDataAndCache();
		assertEquals("success", status.status);
		
		// check that matchMessagesToConvIdOrRefToId() is called once to lookup old messages
		verify(piMessageFacade, times(1)).findPIMonMsgsById(any(String.class));
		
		// check that only 1 message was updated and that its refId is that of the old message
		verify(piMessageFacade, times(1)).update(any(PIMessage.class));
		
		ArgumentCaptor<PIMessage> savedCaptor = ArgumentCaptor.forClass(PIMessage.class);
		verify(piMessageFacade).update(savedCaptor.capture());
		assertEquals("REF_ID FROM OLD MESSAGE", savedCaptor.getValue().getRef_id());
	}
	
	
	/**
	 * Setup 2 synchronous interfaces to be returned by the WS double. Each interface contains
	 * a request and response message. Payloads are also provided and are copies of real 
	 * payloads from PI.
	 * 
	 * @author jscott
	 */
	private class TestPortDoubleWithTwoSyncInterfaces implements AdapterMessageMonitoringVi {
		public XMLGregorianCalendar createXMLGregorianCalendarFromDate(Date date) {
			XMLGregorianCalendar xmlCalendar = null;
			GregorianCalendar calendar = new GregorianCalendar();
			
			calendar.setTime(date);
			
			try {
				xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			} catch (DatatypeConfigurationException e1) {
				//DO SOMETHING
			}
			
			return xmlCalendar;
		}
		
		@Override
		public AdminActionResultMap cancelMessages(ArrayOfString messageKeys)
				throws CancelMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,
				CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfAuditLogEntryData getLogEntries(String messageKey,
				boolean archive, Integer maxResults, Locale locale,
				XMLGregorianCalendar olderThan)
				throws GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,
				GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public byte[] getMessageBytesJavaLangStringBoolean(String messageKey,
				boolean archive)
				throws GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,
				GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc {
			
			String payload = "";
			
			if (messageKey.equals("sync_outbound_today")) {
				// this is a copy of a real message payload for interface ExchangeRatesRetrieveGetData_Out
				payload = "content-type:multipart/related; boundary=SAP_07c9e508-457b-11e3-c3c1-0000313ae59a_END; type=\"text/xml\"; start=\"<soap-07c9e507457b11e393ea0000313ae59a@sap.com>\""
					+ "\ncontent-length:4738"
					+ "\n\n\n--SAP_07c9e508-457b-11e3-c3c1-0000313ae59a_END"
					+ "\nContent-ID: <soap-07c9e507457b11e393ea0000313ae59a@sap.com>"
					+ "\nContent-Disposition: attachment;filename=\"soap-07c9e507457b11e393ea0000313ae59a@sap.com.xml\""
					+ "\nContent-Type: text/xml; charset=utf-8"
					+ "\nContent-Description: SOAP"
					+ "\n\n<SOAP:Envelope xmlns:SOAP='http://schemas.xmlsoap.org/soap/envelope/'><SOAP:Header xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:dlws='http://services.bloomberg.com/datalicense/dlws/ps/20071001'><sap:Main xmlns:sap='http://sap.com/xi/XI/Message/30' versionMajor='3' versionMinor='1' env:mustUnderstand='1'><sap:MessageClass>ApplicationResponse</sap:MessageClass><sap:ProcessingMode>synchronous</sap:ProcessingMode><sap:MessageId>07c70c06-457b-11e3-a955-0000313ae59a</sap:MessageId><sap:RefToMessageId>00505682-0185-1ee3-91af-60a1b80b5975</sap:RefToMessageId><sap:TimeSent>2013-11-04T18:00:46Z</sap:TimeSent><sap:Sender><sap:Party agency='http://sap.com/xi/XI' scheme='XIParty'>Bloomberg</sap:Party><sap:Service>DLWS_D</sap:Service></sap:Sender><sap:Receiver><sap:Party agency='' scheme=''></sap:Party><sap:Service>ERD030_D</sap:Service></sap:Receiver><sap:Interface namespace='urn:jaylin.com.au:sap:exchangerates'>ExchangeRatesRetrieveGetData_Out</sap:Interface></sap:Main><sap:ReliableMessaging xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:QualityOfService>BestEffort</sap:QualityOfService></sap:ReliableMessaging><sap:System xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:Record namespace='/xmlvalidation' name='SYNC_RESPONSE_BEFORE_MAPPING'>1</sap:Record></sap:System><sap:Diagnostic xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:TraceLevel>Information</sap:TraceLevel><sap:Logging>Off</sap:Logging></sap:Diagnostic><sap:HopList xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:Hop timeStamp='2013-11-04T18:00:43Z' wasRead='false'><sap:Engine type='BS'>ERD030_D</sap:Engine><sap:Adapter namespace='http://sap.com/xi/XI/System'>XI</sap:Adapter><sap:MessageId>00505682-0185-1ee3-91af-60a1b80b5975</sap:MessageId><sap:Info>3.0</sap:Info></sap:Hop><sap:Hop timeStamp='2013-11-04T18:00:43Z' wasRead='false'><sap:Engine type='AE'>af.pod.dbpod</sap:Engine><sap:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</sap:Adapter><sap:MessageId>00505682-0185-1ee3-91af-60a1b80b5975</sap:MessageId></sap:Hop><sap:Hop timeStamp='2013-11-04T18:00:46Z' wasRead='false'><sap:Engine type='AE'>af.pod.dbpod</sap:Engine><sap:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</sap:Adapter><sap:MessageId>07c70c06-457b-11e3-a955-0000313ae59a</sap:MessageId></sap:Hop></sap:HopList><sap:DynamicConfiguration xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:Record namespace='http://sap.com/xi/XI/Message/30/routing' name='InterfaceDeterminationHash'>f710ef027347744e3ebb97711bc08be7</sap:Record><sap:Record namespace='http://sap.com/xi/XI/Message/30/general' name='senderAgreementGUID'>5b2268b5ad9e39c593a177c541943c13</sap:Record></sap:DynamicConfiguration></SOAP:Header><SOAP:Body xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:dlws='http://services.bloomberg.com/datalicense/dlws/ps/20071001'><sap:Manifest xmlns:sap='http://sap.com/xi/XI/Message/30' xmlns:xlink='http://www.w3.org/1999/xlink'><sap:Payload xlink:type='simple' xlink:href='cid:payload-07c70c07457b11e3ad050000313ae59a@sap.com'><sap:Name>maindocument</sap:Name><sap:Description>main document</sap:Description><sap:Type>Application</sap:Type></sap:Payload></sap:Manifest></SOAP:Body></SOAP:Envelope>"
					+ "\n--SAP_07c9e508-457b-11e3-c3c1-0000313ae59a_END"
					+ "\nContent-ID: <payload-07c70c07457b11e3ad050000313ae59a@sap.com>"
					+ "\nContent-Disposition: attachment;filename=\"maindocument.xml\""
					+ "\nContent-Type: text/xml; charset=utf-8"
					+ "\nContent-Description: maindocument"
					+ "\n\n<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "\n<ns1:ExchangeRatesRetrieveGetData_Response xmlns:ns1=\"urn:jaylin.com.au:sap:exchangerates\"><header><status_code>0</status_code><description>Success</description><responseId>1364880092-1081157090</responseId><rundate>20131105</rundate><closingvalues>true</closingvalues><programflag>daily</programflag><timestarted>2013-11-04T11:30:09-05:00</timestarted></header><rows><id>CILDAUD</id><value>.949700</value></rows><rows><id>CILDEUR</id><value>1.351000</value></rows><rows><id>CILDGBP</id><value>1.595200</value></rows><rows><id>CILDJPY</id><value>98.590000</value></rows><rows><id>CILDKRW</id><value>1062.630000</value></rows><rows><id>CILDMYR</id><value>3.173000</value></rows><rows><id>CILDNOK</id><value>5.943100</value></rows><rows><id>CILDSGD</id><value>1.242700</value></rows></ns1:ExchangeRatesRetrieveGetData_Response>"
					+ "\n--SAP_07c9e508-457b-11e3-c3c1-0000313ae59a_END--";
				
			} else if (messageKey.equals("sync_inbound_today")) {
				// this is a copy of a real message payload for interface DLWSRetrieveGetData_In
				payload = "content-type:multipart/related; boundary=SAP_063cc38f-457b-11e3-abb3-0000313ae59a_END; type=\"text/xml\"; start=\"<soap-0050568201851EE391AF60A1B80B9975@sap.com>\""
					+ "\ncontent-length:4167"
					+ "\n\n\n--SAP_063cc38f-457b-11e3-abb3-0000313ae59a_END"
					+ "\ncontent-id: <soap-0050568201851EE391AF60A1B80B9975@sap.com>"
					+ "\nContent-Type: text/xml; charset=utf-8"
					+ "\n\n<SOAP:Envelope xmlns:SOAP='http://schemas.xmlsoap.org/soap/envelope/'><SOAP:Header xmlns:SOAP='http://schemas.xmlsoap.org/soap/envelope/' xmlns:SAP='http://sap.com/xi/XI/Message/30' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns:wsu='http://www.docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd' xmlns:wsse='http://www.docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd' xmlns:versionMajor='003' xmlns:versionMinor='001' xmlns:mustUnderstand='1' xmlns:Id='wsuid-main-92ABE13F5C59AB7FE10000000A1551F7'><SAP:Main versionMajor='3' versionMinor='1' SOAP:mustUnderstand='1' wsu:Id='wsuid-main-92ABE13F5C59AB7FE10000000A1551F7'><SAP:MessageClass>ApplicationMessage</SAP:MessageClass><SAP:ProcessingMode>synchronous</SAP:ProcessingMode><SAP:MessageId>00505682-0185-1ee3-91af-60a1b80b5975</SAP:MessageId><SAP:TimeSent>2013-11-04T18:00:43Z</SAP:TimeSent><SAP:Sender><SAP:Party agency='' scheme=''></SAP:Party><SAP:Service>ERD030_D</SAP:Service></SAP:Sender><SAP:Receiver><SAP:Party agency='http://sap.com/xi/XI' scheme='XIParty'>Bloomberg</SAP:Party><SAP:Service>DLWS_D</SAP:Service></SAP:Receiver><SAP:Interface namespace='urn:bloomberg.com:dlws'>DLWSRetrieveGetData_In</SAP:Interface></SAP:Main><SAP:ReliableMessaging SOAP:mustUnderstand='1'><SAP:QualityOfService>BestEffort</SAP:QualityOfService></SAP:ReliableMessaging><SAP:System SOAP:mustUnderstand='1'><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='interfaceDeterminationGUID'>315b2382f9a311e2ae5c0000313ae59a</SAP:Record><SAP:Record namespace='http://www.sap.com/webas/712/soap/features/runtime/metering/' name='CallingType'>SA</SAP:Record><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='syncTimeout'>300000</SAP:Record><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='senderAgreementGUID'>5b2268b5ad9e39c593a177c541943c13</SAP:Record></SAP:System><SAP:Diagnostic SOAP:mustUnderstand='1'><SAP:TraceLevel>Information</SAP:TraceLevel><SAP:Logging>Off</SAP:Logging></SAP:Diagnostic><SAP:HopList SOAP:mustUnderstand='1'><SAP:Hop timeStamp='2013-11-04T18:00:43Z' wasRead='false'><SAP:Engine type='BS'>ERD030_D</SAP:Engine><SAP:Adapter namespace='http://sap.com/xi/XI/System'>XI</SAP:Adapter><SAP:MessageId>00505682-0185-1ee3-91af-60a1b80b5975</SAP:MessageId><SAP:Info>3.0</SAP:Info></SAP:Hop><SAP:Hop timeStamp='2013-11-04T18:00:43Z' wasRead='false'><SAP:Engine type='AE'>af.pod.dbpod</SAP:Engine><SAP:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</SAP:Adapter><SAP:MessageId>00505682-0185-1ee3-91af-60a1b80b5975</SAP:MessageId></SAP:Hop><SAP:Hop timeStamp='2013-11-04T18:00:46Z' wasRead='false'><SAP:Engine type='AE'>af.pod.dbpod</SAP:Engine><SAP:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</SAP:Adapter><SAP:MessageId>07c70c06-457b-11e3-a955-0000313ae59a</SAP:MessageId></SAP:Hop></SAP:HopList><SAP:DynamicConfiguration SOAP:mustUnderstand='1'><SAP:Record namespace='http://sap.com/xi/XI/Message/30/routing' name='InterfaceDeterminationHash'>f710ef027347744e3ebb97711bc08be7</SAP:Record><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='senderAgreementGUID'>5b2268b5ad9e39c593a177c541943c13</SAP:Record></SAP:DynamicConfiguration></SOAP:Header><SOAP:Body><sap:Manifest xmlns:sap='http://sap.com/xi/XI/Message/30' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns:wsu='http://www.docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd' wsu:Id='wsuid-manifest-5CABE13F5C59AB7FE10000000A1551F7'><sap:Payload xlink:type='simple' xlink:href='cid:payload-0050568201851EE391AF60A1B80B7975@sap.com'><sap:Name>MainDocument</sap:Name><sap:Description></sap:Description><sap:Type>Application</sap:Type></sap:Payload></sap:Manifest></SOAP:Body></SOAP:Envelope>"
					+ "\n--SAP_063cc38f-457b-11e3-abb3-0000313ae59a_END"
					+ "\ncontent-id: <payload-0050568201851EE391AF60A1B80B7975@sap.com>"
					+ "\nContent-Type: application/xml"
					+ "\n\n<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "\n<ns1:retrieveGetDataRequest xmlns:ns1=\"http://services.bloomberg.com/datalicense/dlws/ps/20071001\"><ns1:responseId>1364880092-1081157090</ns1:responseId></ns1:retrieveGetDataRequest>"
					+ "\n--SAP_063cc38f-457b-11e3-abb3-0000313ae59a_END--";
				
			} else if (messageKey.equals("sync_outbound_yesterday")) {
				// this is a copy of a real message payload for interface ExchangeRatesRetrieveGetData_Out that was executed the day before
				payload = "content-type:multipart/related; boundary=SAP_ddd01cf4-44b1-11e3-bdbc-0000313ae59a_END; type=\"text/xml\"; start=\"<soap-ddd00f1444b111e3864b0000313ae59a@sap.com>\""
					+ "\ncontent-length:4738"
					+ "\n\n\n--SAP_ddd01cf4-44b1-11e3-bdbc-0000313ae59a_END"
					+ "\nContent-ID: <soap-ddd00f1444b111e3864b0000313ae59a@sap.com>"
					+ "\nContent-Disposition: attachment;filename=\"soap-ddd00f1444b111e3864b0000313ae59a@sap.com.xml\""
					+ "\nContent-Type: text/xml; charset=utf-8"
					+ "\nContent-Description: SOAP"
					+ "\n\n<SOAP:Envelope xmlns:SOAP='http://schemas.xmlsoap.org/soap/envelope/'><SOAP:Header xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:dlws='http://services.bloomberg.com/datalicense/dlws/ps/20071001'><sap:Main xmlns:sap='http://sap.com/xi/XI/Message/30' versionMajor='3' versionMinor='1' env:mustUnderstand='1'><sap:MessageClass>ApplicationResponse</sap:MessageClass><sap:ProcessingMode>synchronous</sap:ProcessingMode><sap:MessageId>ddcd744a-44b1-11e3-a7fe-0000313ae59a</sap:MessageId><sap:RefToMessageId>00505682-0185-1ee3-9196-3b46bfe93975</sap:RefToMessageId><sap:TimeSent>2013-11-03T18:00:47Z</sap:TimeSent><sap:Sender><sap:Party agency='http://sap.com/xi/XI' scheme='XIParty'>Bloomberg</sap:Party><sap:Service>DLWS_D</sap:Service></sap:Sender><sap:Receiver><sap:Party agency='' scheme=''></sap:Party><sap:Service>ERD030_D</sap:Service></sap:Receiver><sap:Interface namespace='urn:jaylin.com.au:sap:exchangerates'>ExchangeRatesRetrieveGetData_Out</sap:Interface></sap:Main><sap:ReliableMessaging xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:QualityOfService>BestEffort</sap:QualityOfService></sap:ReliableMessaging><sap:System xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:Record namespace='/xmlvalidation' name='SYNC_RESPONSE_BEFORE_MAPPING'>1</sap:Record></sap:System><sap:Diagnostic xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:TraceLevel>Information</sap:TraceLevel><sap:Logging>Off</sap:Logging></sap:Diagnostic><sap:HopList xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:Hop timeStamp='2013-11-03T18:00:44Z' wasRead='false'><sap:Engine type='BS'>ERD030_D</sap:Engine><sap:Adapter namespace='http://sap.com/xi/XI/System'>XI</sap:Adapter><sap:MessageId>00505682-0185-1ee3-9196-3b46bfe93975</sap:MessageId><sap:Info>3.0</sap:Info></sap:Hop><sap:Hop timeStamp='2013-11-03T18:00:44Z' wasRead='false'><sap:Engine type='AE'>af.pod.dbpod</sap:Engine><sap:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</sap:Adapter><sap:MessageId>00505682-0185-1ee3-9196-3b46bfe93975</sap:MessageId></sap:Hop><sap:Hop timeStamp='2013-11-03T18:00:47Z' wasRead='false'><sap:Engine type='AE'>af.pod.dbpod</sap:Engine><sap:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</sap:Adapter><sap:MessageId>ddcd744a-44b1-11e3-a7fe-0000313ae59a</sap:MessageId></sap:Hop></sap:HopList><sap:DynamicConfiguration xmlns:sap='http://sap.com/xi/XI/Message/30' env:mustUnderstand='1'><sap:Record namespace='http://sap.com/xi/XI/Message/30/routing' name='InterfaceDeterminationHash'>f710ef027347744e3ebb97711bc08be7</sap:Record><sap:Record namespace='http://sap.com/xi/XI/Message/30/general' name='senderAgreementGUID'>5b2268b5ad9e39c593a177c541943c13</sap:Record></sap:DynamicConfiguration></SOAP:Header><SOAP:Body xmlns:env='http://schemas.xmlsoap.org/soap/envelope/' xmlns:dlws='http://services.bloomberg.com/datalicense/dlws/ps/20071001'><sap:Manifest xmlns:sap='http://sap.com/xi/XI/Message/30' xmlns:xlink='http://www.w3.org/1999/xlink'><sap:Payload xlink:type='simple' xlink:href='cid:payload-ddcd9a3244b111e396cd0000313ae59a@sap.com'><sap:Name>maindocument</sap:Name><sap:Description>main document</sap:Description><sap:Type>Application</sap:Type></sap:Payload></sap:Manifest></SOAP:Body></SOAP:Envelope>"
					+ "\n--SAP_ddd01cf4-44b1-11e3-bdbc-0000313ae59a_END"
					+ "\nContent-ID: <payload-ddcd9a3244b111e396cd0000313ae59a@sap.com>"
					+ "\nContent-Disposition: attachment;filename=\"maindocument.xml\""
					+ "\nContent-Type: text/xml; charset=utf-8"
					+ "\nContent-Description: maindocument"
					+ "\n\n<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "\n<ns1:ExchangeRatesRetrieveGetData_Response xmlns:ns1=\"urn:jaylin.com.au:sap:exchangerates\"><header><status_code>0</status_code><description>Success</description><responseId>1364880092-1081157090</responseId><rundate>20131104</rundate><closingvalues>true</closingvalues><programflag>daily</programflag><timestarted>2013-11-03T11:30:06-05:00</timestarted></header><rows><id>CILDAUD</id><value>.943700</value></rows><rows><id>CILDEUR</id><value>1.348700</value></rows><rows><id>CILDGBP</id><value>1.592100</value></rows><rows><id>CILDJPY</id><value>98.780000</value></rows><rows><id>CILDKRW</id><value>1061.360000</value></rows><rows><id>CILDMYR</id><value>3.172000</value></rows><rows><id>CILDNOK</id><value>5.968400</value></rows><rows><id>CILDSGD</id><value>1.243500</value></rows></ns1:ExchangeRatesRetrieveGetData_Response>"
					+ "\n--SAP_ddd01cf4-44b1-11e3-bdbc-0000313ae59a_END--";
				
			} else if (messageKey.equals("sync_inbound_yesterday")) {
				// this is a copy of a real message payload for interface DLWSRetrieveGetData_In that was executed the day before
				payload = "content-type:multipart/related; boundary=SAP_dc5c8b72-44b1-11e3-cb0b-0000313ae59a_END; type=\"text/xml\"; start=\"<soap-0050568201851EE391963B46BFE99975@sap.com>\""
					+ "\ncontent-length:4167"
					+ "\n\n\n--SAP_dc5c8b72-44b1-11e3-cb0b-0000313ae59a_END"
					+ "\ncontent-id: <soap-0050568201851EE391963B46BFE99975@sap.com>"
					+ "\nContent-Type: text/xml; charset=utf-8"
					+ "\n\n<SOAP:Envelope xmlns:SOAP='http://schemas.xmlsoap.org/soap/envelope/'><SOAP:Header xmlns:SOAP='http://schemas.xmlsoap.org/soap/envelope/' xmlns:SAP='http://sap.com/xi/XI/Message/30' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns:wsu='http://www.docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd' xmlns:wsse='http://www.docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd' xmlns:versionMajor='003' xmlns:versionMinor='001' xmlns:mustUnderstand='1' xmlns:Id='wsuid-main-92ABE13F5C59AB7FE10000000A1551F7'><SAP:Main versionMajor='3' versionMinor='1' SOAP:mustUnderstand='1' wsu:Id='wsuid-main-92ABE13F5C59AB7FE10000000A1551F7'><SAP:MessageClass>ApplicationMessage</SAP:MessageClass><SAP:ProcessingMode>synchronous</SAP:ProcessingMode><SAP:MessageId>00505682-0185-1ee3-9196-3b46bfe93975</SAP:MessageId><SAP:TimeSent>2013-11-03T18:00:44Z</SAP:TimeSent><SAP:Sender><SAP:Party agency='' scheme=''></SAP:Party><SAP:Service>ERD030_D</SAP:Service></SAP:Sender><SAP:Receiver><SAP:Party agency='http://sap.com/xi/XI' scheme='XIParty'>Bloomberg</SAP:Party><SAP:Service>DLWS_D</SAP:Service></SAP:Receiver><SAP:Interface namespace='urn:bloomberg.com:dlws'>DLWSRetrieveGetData_In</SAP:Interface></SAP:Main><SAP:ReliableMessaging SOAP:mustUnderstand='1'><SAP:QualityOfService>BestEffort</SAP:QualityOfService></SAP:ReliableMessaging><SAP:System SOAP:mustUnderstand='1'><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='interfaceDeterminationGUID'>315b2382f9a311e2ae5c0000313ae59a</SAP:Record><SAP:Record namespace='http://www.sap.com/webas/712/soap/features/runtime/metering/' name='CallingType'>SA</SAP:Record><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='syncTimeout'>300000</SAP:Record><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='senderAgreementGUID'>5b2268b5ad9e39c593a177c541943c13</SAP:Record></SAP:System><SAP:Diagnostic SOAP:mustUnderstand='1'><SAP:TraceLevel>Information</SAP:TraceLevel><SAP:Logging>Off</SAP:Logging></SAP:Diagnostic><SAP:HopList SOAP:mustUnderstand='1'><SAP:Hop timeStamp='2013-11-03T18:00:44Z' wasRead='false'><SAP:Engine type='BS'>ERD030_D</SAP:Engine><SAP:Adapter namespace='http://sap.com/xi/XI/System'>XI</SAP:Adapter><SAP:MessageId>00505682-0185-1ee3-9196-3b46bfe93975</SAP:MessageId><SAP:Info>3.0</SAP:Info></SAP:Hop><SAP:Hop timeStamp='2013-11-03T18:00:44Z' wasRead='false'><SAP:Engine type='AE'>af.pod.dbpod</SAP:Engine><SAP:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</SAP:Adapter><SAP:MessageId>00505682-0185-1ee3-9196-3b46bfe93975</SAP:MessageId></SAP:Hop><SAP:Hop timeStamp='2013-11-03T18:00:47Z' wasRead='false'><SAP:Engine type='AE'>af.pod.dbpod</SAP:Engine><SAP:Adapter namespace='http://sap.com/xi/XI/System'>XIRA</SAP:Adapter><SAP:MessageId>ddcd744a-44b1-11e3-a7fe-0000313ae59a</SAP:MessageId></SAP:Hop></SAP:HopList><SAP:DynamicConfiguration SOAP:mustUnderstand='1'><SAP:Record namespace='http://sap.com/xi/XI/Message/30/routing' name='InterfaceDeterminationHash'>f710ef027347744e3ebb97711bc08be7</SAP:Record><SAP:Record namespace='http://sap.com/xi/XI/Message/30/general' name='senderAgreementGUID'>5b2268b5ad9e39c593a177c541943c13</SAP:Record></SAP:DynamicConfiguration></SOAP:Header><SOAP:Body><sap:Manifest xmlns:sap='http://sap.com/xi/XI/Message/30' xmlns:xlink='http://www.w3.org/1999/xlink' xmlns:wsu='http://www.docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd' wsu:Id='wsuid-manifest-5CABE13F5C59AB7FE10000000A1551F7'><sap:Payload xlink:type='simple' xlink:href='cid:payload-0050568201851EE391963B46BFE97975@sap.com'><sap:Name>MainDocument</sap:Name><sap:Description></sap:Description><sap:Type>Application</sap:Type></sap:Payload></sap:Manifest></SOAP:Body></SOAP:Envelope>"
					+ "\n--SAP_dc5c8b72-44b1-11e3-cb0b-0000313ae59a_END"
					+ "\ncontent-id: <payload-0050568201851EE391963B46BFE97975@sap.com>"
					+ "\nContent-Type: application/xml"
					+ "\n\n<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "\n<ns1:retrieveGetDataRequest xmlns:ns1=\"http://services.bloomberg.com/datalicense/dlws/ps/20071001\"><ns1:responseId>1364880092-1081157090</ns1:responseId></ns1:retrieveGetDataRequest>"
					+ "\n--SAP_dc5c8b72-44b1-11e3-cb0b-0000313ae59a_END--";
				
			}
			
			return payload.getBytes();
		}

		@Override
		public byte[] getMessageBytesJavaLangStringIntBoolean(
				String messageKey, int version, boolean archive)
				throws GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,
				GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MessageSearchReturnValue getMessageList(AdapterFilter filter,
				Integer maxMessages)
				throws GetMessageListComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			
			// setup a fake WS response
			MessageSearchReturnValue response = new MessageSearchReturnValue();
			ArrayOfAdapterFrameworkData dataArray = new ArrayOfAdapterFrameworkData();
			List<AdapterFrameworkData> list = dataArray.getAdapterFrameworkData();
			
			// get start date from filter
			JAXBElement<XMLGregorianCalendar> fromTimeJAXB = filter.getFromTime();
			Date filterFromTime = fromTimeJAXB.getValue().toGregorianCalendar().getTime();
			
			// add message items to the AdapterFrameworkData list
			Date dStart = null;
			Date dEnd = null;
			
			// setup a sync iflow for a day made up of two messages
			dStart = setDate("05-11-2013 02:00:46");
			dEnd = setDate("05-11-2013 02:00:46");
			
			if (dStart.after(filterFromTime)) {
				createFakeMessage(
					list,
					"dir://ICO/5b2268b5ad9e39c593a177c541943c13",
					"07c70c06-457b-11e3-a955-0000313ae59a",
					"sync_outbound_today",
					"ExchangeRatesRetrieveGetData_Out",
					"urn:jaylin.com.au:sap:exchangerates",
					dEnd,
					dStart,
					"success",
					"Bloomberg",
					"DLWS_D"
				);
			}
			
			dStart = setDate("05-11-2013 02:00:43");
			dEnd = setDate("05-11-2013 02:00:46");
			
			if (dStart.after(filterFromTime)) {
				createFakeMessage(
					list,
					"dir://ICO/5b2268b5ad9e39c593a177c541943c13",
					"00505682-0185-1ee3-91af-60a1b80b5975",
					"sync_inbound_today",
					"DLWSRetrieveGetData_In",
					"urn:bloomberg.com:dlws",
					dEnd,
					dStart,
					"success",
					"",
					"ERD030_D"
				);
			}
			
			// setup a sync iflow for day-1 made up of two messages
			dStart = setDate("04-11-2013 02:00:47");
			dEnd = setDate("04-11-2013 02:00:47");
			
			if (dStart.after(filterFromTime)) {
				createFakeMessage(
					list,
					"dir://ICO/5b2268b5ad9e39c593a177c541943c13",
					"ddcd744a-44b1-11e3-a7fe-0000313ae59a",
					"sync_outbound_yesterday",
					"ExchangeRatesRetrieveGetData_Out",
					"urn:jaylin.com.au:sap:exchangerates",
					dEnd,
					dStart,
					"success",
					"Bloomberg",
					"DLWS_D"
				);
			}
			
			dStart = setDate("04-11-2013 02:00:44");
			dEnd = setDate("04-11-2013 02:00:47");
			
			if (dStart.after(filterFromTime)) {
				createFakeMessage(
					list,
					"dir://ICO/5b2268b5ad9e39c593a177c541943c13",
					"00505682-0185-1ee3-9196-3b46bfe93975",
					"sync_inbound_yesterday",
					"DLWSRetrieveGetData_In",
					"urn:bloomberg.com:dlws",
					dEnd,
					dStart,
					"success",
					"",
					"ERD030_D"
				);
			}
			
			// add the list of messages into the WS fake WS response
			JAXBElement<ArrayOfAdapterFrameworkData> a = new JAXBElement<ArrayOfAdapterFrameworkData>(new QName("ArrayOfAdapterFrameworkData"), ArrayOfAdapterFrameworkData.class, dataArray);
			response.setList(a);
			
			return response;
		}

		private Date setDate(String dateString) {
			Date d = null;
			
			try {
				d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(dateString);
			} catch (ParseException e) { }
			
			return d;
		}

		private void createFakeMessage(List<AdapterFrameworkData> list, String scenarioName, String msgId, String msgKey, String interfaceName, String namespace, Date endDate, Date startDate, String status, String party, String senderName) {
			AdapterFrameworkData afd = new AdapterFrameworkData();
			
			JAXBElement<String> sceanrio = new JAXBElement<String>(new QName("msgid"), String.class, scenarioName);
			afd.setScenarioIdentifier(sceanrio);
			
			JAXBElement<String> mId = new JAXBElement<String>(new QName("msgid"), String.class, msgId);
			afd.setMessageID(mId);
			
			JAXBElement<String> mKey = new JAXBElement<String>(new QName("msgid"), String.class, msgKey);
			afd.setMessageKey(mKey);
			
			MessageInterface messageInterface = new MessageInterface();
			JAXBElement<String> messageInterfaceValue = new JAXBElement<String>(new QName("interface"), String.class, interfaceName);
			messageInterface.setName(messageInterfaceValue);
			JAXBElement<String> ns = new JAXBElement<String>(new QName("namespace"), String.class, namespace);
			messageInterface.setNamespace(ns);
			JAXBElement<MessageInterface> mi = new JAXBElement<MessageInterface>(new QName("message_interface"), MessageInterface.class, messageInterface);
			//afd.setInterface(mi);
			afd.setSenderInterface(mi);
			
			JAXBElement<XMLGregorianCalendar> jaxbCalEnd = new JAXBElement<XMLGregorianCalendar>(new QName("end_date"), XMLGregorianCalendar.class, createXMLGregorianCalendarFromDate(endDate));
			afd.setEndTime(jaxbCalEnd);
			
			JAXBElement<XMLGregorianCalendar> jaxbCalStart = new JAXBElement<XMLGregorianCalendar>(new QName("end_date"), XMLGregorianCalendar.class, createXMLGregorianCalendarFromDate(startDate));
			afd.setStartTime(jaxbCalStart);
			
			JAXBElement<String> stat = new JAXBElement<String>(new QName("status"), String.class, status);
			afd.setStatus(stat);
			
			MessageParty msgParty = new MessageParty();
			JAXBElement<String> msgPartyText = new JAXBElement<String>(new QName("party_text"), String.class, party);
			msgParty.setName(msgPartyText);
			JAXBElement<MessageParty> p = new JAXBElement<MessageParty>(new QName("sender_party"), MessageParty.class, msgParty);
			afd.setSenderParty(p);
			
			JAXBElement<String> sender = new JAXBElement<String>(new QName("sender_name"), String.class, senderName);
			afd.setSenderName(sender);
			
			list.add(afd);
		}

		@Override
		public MessageSearchReturnValue getMessagesByKeys(ArrayOfString filter,
				Integer maxMessages)
				throws GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfStatusDetail getStatusDetails(ArrayOfString errorCodes,
				Locale locale)
				throws GetStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public AdminActionResultMap resendMessages(ArrayOfString messageKeys)
				throws ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,
				ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfStatusDetail getAllAvailableStatusDetails(Locale locale)
				throws GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfString getConnections()
				throws GetConnectionsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfString getErrorCodes(Integer errorLabelID)
				throws GetErrorCodesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfIntegrationFlow getIntegrationFlows(String language)
				throws GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfMessageInterface getInterfaces()
				throws GetInterfacesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfMessageParty getParties()
				throws GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfString getServices()
				throws GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfAttributeMetadata getUserDefinedSearchExtractors(
				String name, String namespace)
				throws GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayOfMessageInterface getUserDefinedSearchFilters()
				throws GetUserDefinedSearchFiltersComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MessageSearchReturnValue getUserDefinedSearchMessages(
				AdapterFilter filter, Integer maxMessages,
				ArrayOfBusinessAttribute attributes, String operator)
				throws GetUserDefinedSearchMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
