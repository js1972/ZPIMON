package au.com.jaylin.pimon.rest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import au.com.jaylin.persistence.PIMessage;
import au.com.jaylin.persistence.ejbs.PIMessageHandlerLocal;

@RunWith(MockitoJUnitRunner.class)
public class IflowListBuilderImpTest {
	@Mock
	PIMessageHandlerLocal msgHandlerMock;
	
	
	@Test
	public void whenNoMessagesShouldResultInNoIflows() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_YEAR, -1);
		
		timestamps.put("begin", c.getTime());  //yesterday
		timestamps.put("end", new Date());     //today
		
		List<PIMessage> messages = new ArrayList<PIMessage>();
		
		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);
		
		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		assertEquals(new ArrayList<IFlow>(), iflows);
	}

	@Test
	public void whenOneMessageShouldResultInOneIflow() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_YEAR, -1);
		
		timestamps.put("begin", c.getTime());  //yesterday
		timestamps.put("end", new Date());     //today
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		message.setEnd_time(new Date());
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		assertEquals(1, iflows.size());
	}
	
	@Test
	public void whenTwoMessagesWithDifferentRefidsShouldResultInTwoIflows() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_YEAR, -1);
		
		timestamps.put("begin", c.getTime());  //yesterday
		timestamps.put("end", new Date());     //today
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		message.setEnd_time(new Date());
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);
		
		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		message2.setEnd_time(new Date());
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59X");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(new Date());
		message2.setStatus("success");
		messages.add(message2);

		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		assertEquals(2, iflows.size());
	}
	
	@Test
	public void whenThreeMessagesWithOneHavingADifferentRefidShouldResultInTwoIflows() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_YEAR, -1);
		
		timestamps.put("begin", c.getTime());  //yesterday
		timestamps.put("end", new Date());     //today
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		message.setEnd_time(new Date());
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		message2.setEnd_time(new Date());
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(new Date());
		message2.setStatus("success");
		messages.add(message2);
		
		PIMessage message3 = new PIMessage();
		message3.setId(UUID.randomUUID().toString());
		message3.setEnd_time(new Date());
		message3.setIflow("iflowName");
		message3.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message3.setPayload("<xml><payload>test</payload></xml>");
		message3.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59X");
		message3.setSender_interface("interface_async_out");
		message3.setSender_name("sender");
		message3.setSender_namespace("urn:au.com.jaylin.test");
		message3.setSender_party(null);
		message3.setStart_time(new Date());
		message3.setStatus("success");
		messages.add(message3);
		
		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		assertEquals(2, iflows.size());
	}
	
	@Test
	public void whenThreeMessagesWithDifferentRefidsShouldResultInThreeIflows() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_YEAR, -1);
		
		timestamps.put("begin", c.getTime());  //yesterday
		timestamps.put("end", new Date());     //today
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		message.setEnd_time(new Date());
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		message2.setEnd_time(new Date());
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59X");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(new Date());
		message2.setStatus("success");
		messages.add(message2);
		
		PIMessage message3 = new PIMessage();
		message3.setId(UUID.randomUUID().toString());
		message3.setEnd_time(new Date());
		message3.setIflow("iflowName");
		message3.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message3.setPayload("<xml><payload>test</payload></xml>");
		message3.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59Y");
		message3.setSender_interface("interface_async_out");
		message3.setSender_name("sender");
		message3.setSender_namespace("urn:au.com.jaylin.test");
		message3.setSender_party(null);
		message3.setStart_time(new Date());
		message3.setStatus("success");
		messages.add(message3);
		
		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		assertEquals(3, iflows.size());
	}
	
	@Test
	public void whenThreeMessagesWithSameRefidShouldResultInOneIflowWithStartDateLowest() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		
		Date d = null;
		try {
			d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 10:55:00");
		} catch (ParseException e) { }
		
		timestamps.put("begin", d);
		timestamps.put("end", d);
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		message.setEnd_time(new Date());
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		Date d2 = null;
		try {
			d2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		message2.setEnd_time(d2);
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(d2);
		message2.setStatus("success");
		messages.add(message2);
		
		PIMessage message3 = new PIMessage();
		message3.setId(UUID.randomUUID().toString());
		Date d3 = null;
		try {
			d3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2013 01:59:35");
		} catch (ParseException e) { }
		message3.setEnd_time(d3);
		message3.setIflow("iflowName");
		message3.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message3.setPayload("<xml><payload>test</payload></xml>");
		message3.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message3.setSender_interface("interface_async_out");
		message3.setSender_name("sender");
		message3.setSender_namespace("urn:au.com.jaylin.test");
		message3.setSender_party(null);
		message3.setStart_time(d3);
		message3.setStatus("success");
		messages.add(message3);
		
		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		IFlow iflow = iflows.get(0);
		
		Date dExpected = null;
		try {
			dExpected = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		
		assertEquals(dExpected, iflow.startTime);
	}
	
	@Test
	public void whenThreeMessagesWithSameRefidShouldResultInOneIflowWithEndDateHighest() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		
		Date d = null;
		try {
			d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 10:55:00");
		} catch (ParseException e) { }
		
		timestamps.put("begin", d);
		timestamps.put("end", d);
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		Date d1 = null;
		try {
			d1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 17:11:11");
		} catch (ParseException e) { }
		message.setEnd_time(d1);
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		Date d2 = null;
		try {
			d2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		message2.setEnd_time(d2);
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(d2);
		message2.setStatus("success");
		messages.add(message2);
		
		PIMessage message3 = new PIMessage();
		message3.setId(UUID.randomUUID().toString());
		Date d3 = null;
		try {
			d3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2013 01:59:35");
		} catch (ParseException e) { }
		message3.setEnd_time(d3);
		message3.setIflow("iflowName");
		message3.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message3.setPayload("<xml><payload>test</payload></xml>");
		message3.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message3.setSender_interface("interface_async_out");
		message3.setSender_name("sender");
		message3.setSender_namespace("urn:au.com.jaylin.test");
		message3.setSender_party(null);
		message3.setStart_time(d3);
		message3.setStatus("success");
		messages.add(message3);
		
		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		IFlow iflow = iflows.get(0);
		
		Date dExpected = null;
		try {
			dExpected = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2013 01:59:35");
		} catch (ParseException e) { }
		
		assertEquals(dExpected, iflow.endTime);
	}

	@Test
	public void whenThreeMessagesWithSameRefidShouldResultInOneIflowWithWorstStatus() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		
		Date d = null;
		try {
			d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 10:55:00");
		} catch (ParseException e) { }
		
		timestamps.put("begin", d);
		timestamps.put("end", d);
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		message.setEnd_time(new Date());
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		Date d2 = null;
		try {
			d2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		message2.setEnd_time(d2);
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(d2);
		message2.setStatus("system error");
		messages.add(message2);
		
		PIMessage message3 = new PIMessage();
		message3.setId(UUID.randomUUID().toString());
		Date d3 = null;
		try {
			d3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2013 01:59:35");
		} catch (ParseException e) { }
		message3.setEnd_time(d3);
		message3.setIflow("iflowName");
		message3.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message3.setPayload("<xml><payload>test</payload></xml>");
		message3.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message3.setSender_interface("interface_async_out");
		message3.setSender_name("sender");
		message3.setSender_namespace("urn:au.com.jaylin.test");
		message3.setSender_party(null);
		message3.setStart_time(d3);
		message3.setStatus("canceled");
		messages.add(message3);
		
		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		IFlow iflow = iflows.get(0);
		
		assertEquals("system error", iflow.status);
	}

	@Test
	public void whenResultIsThreeIflowsShouldBeSortedByEndDateDescending() {
		PIMessageHandlerLocal mockedMessageHandler = mock(PIMessageHandlerLocal.class);
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(mockedMessageHandler);
		
		Map<String, Date> timestamps = new HashMap<String, Date>();
		timestamps.put("begin", new Date());
		timestamps.put("end", new Date());
		
		List<PIMessage> messages = new ArrayList<PIMessage>();

		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		Date d = null;
		try {
			d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		message.setEnd_time(d);
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		Date d2 = null;
		try {
			d2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		message2.setEnd_time(d2);
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59X");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(d2);
		message2.setStatus("success");
		messages.add(message2);
		
		PIMessage message3 = new PIMessage();
		message3.setId(UUID.randomUUID().toString());
		Date d3 = null;
		try {
			d3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2013 01:59:35");
		} catch (ParseException e) { }
		message3.setEnd_time(d3);
		message3.setIflow("iflowName");
		message3.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message3.setPayload("<xml><payload>test</payload></xml>");
		message3.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59Y");
		message3.setSender_interface("interface_async_out");
		message3.setSender_name("sender");
		message3.setSender_namespace("urn:au.com.jaylin.test");
		message3.setSender_party(null);
		message3.setStart_time(d3);
		message3.setStatus("success");
		messages.add(message3);
		
		when(mockedMessageHandler.readIflows(timestamps)).thenReturn(messages);

		List<IFlow> iflows = iflowBuilder.build(timestamps, false);
		
		//algorithm for checking sorts:
		//boolean ascending = true, descending = true;
		//for (int i = 1; i < arr.length && (ascending || descending); i++) {
		//    ascending = ascending && arr[i] >= arr[i-1];
		//    descending = descending && arr[i] <= arr[i-1];
		//}
		boolean ascending = true, descending = true;
		for (int i = 1; i < iflows.size() && (ascending || descending); i++) {
			ascending = ascending && iflows.get(i).endTime.getTime() >= iflows.get(i-1).endTime.getTime();
		    descending = descending && iflows.get(i).endTime.getTime() <= iflows.get(i-1).endTime.getTime();
		}
		
		assertEquals(3, iflows.size());
		assertEquals(true, descending);
	}
	
	@Test
	public void whenSomeMssagesHaveErrorsOnlyShowTheErrorIflows() {
		Map<String, Date> timestamps = new HashMap<String, Date>();
		timestamps.put("begin", new Date());
		timestamps.put("end", new Date());
		
		List<PIMessage> messages = new ArrayList<PIMessage>();
		
		// setup iflow 1
		PIMessage message = new PIMessage();
		message.setId(UUID.randomUUID().toString());
		Date d = null;
		try {
			d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		message.setEnd_time(d);
		message.setIflow("iflowName");
		message.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message.setPayload("<xml><payload>test</payload></xml>");
		message.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message.setSender_interface("interface_async_out");
		message.setSender_name("sender");
		message.setSender_namespace("urn:au.com.jaylin.test");
		message.setSender_party(null);
		message.setStart_time(new Date());
		message.setStatus("success");
		messages.add(message);

		PIMessage message2 = new PIMessage();
		message2.setId(UUID.randomUUID().toString());
		Date d2 = null;
		try {
			d2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("22-10-2013 09:55:00");
		} catch (ParseException e) { }
		message2.setEnd_time(d2);
		message2.setIflow("iflowName");
		message2.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message2.setPayload("<xml><payload>test</payload></xml>");
		message2.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59a");
		message2.setSender_interface("interface_async_out");
		message2.setSender_name("sender");
		message2.setSender_namespace("urn:au.com.jaylin.test");
		message2.setSender_party(null);
		message2.setStart_time(d2);
		message2.setStatus("success");
		messages.add(message2);
		
		// setup iflow 2
		PIMessage message3 = new PIMessage();
		message3.setId(UUID.randomUUID().toString());
		Date d3 = null;
		try {
			d3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2013 01:59:35");
		} catch (ParseException e) { }
		message3.setEnd_time(d3);
		message3.setIflow("iflowName");
		message3.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message3.setPayload("<xml><payload>test</payload></xml>");
		message3.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59Y");
		message3.setSender_interface("interface_async_out");
		message3.setSender_name("sender");
		message3.setSender_namespace("urn:au.com.jaylin.test");
		message3.setSender_party(null);
		message3.setStart_time(d3);
		message3.setStatus("success");
		messages.add(message3);
		
		PIMessage message4 = new PIMessage();
		message4.setId(UUID.randomUUID().toString());
		Date d4 = null;
		try {
			d4 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("23-10-2013 01:59:35");
		} catch (ParseException e) { }
		message4.setEnd_time(d4);
		message4.setIflow("iflowName");
		message4.setMessage_key("793bc281-39b1-11e3-ace8-0000313ae59a\\0\\EO\\0");
		message4.setPayload("<xml><payload>test</payload></xml>");
		message4.setRef_id("793bc281-39b1-11e3-ace8-0000313ae59Y");
		message4.setSender_interface("interface_async_out");
		message4.setSender_name("sender");
		message4.setSender_namespace("urn:au.com.jaylin.test");
		message4.setSender_party(null);
		message4.setStart_time(d3);
		message4.setStatus("system error");
		messages.add(message4);
		
		when(msgHandlerMock.readIflows(timestamps)).thenReturn(messages);
		
		IflowListBuilder iflowBuilder = new IflowListBuilderImp(msgHandlerMock);
		List<IFlow> iflows = iflowBuilder.build(timestamps, true);
		
		assertEquals(1, iflows.size());
		IFlow iflow = iflows.get(0);
		assertEquals("system error", iflow.status);
	}
}
