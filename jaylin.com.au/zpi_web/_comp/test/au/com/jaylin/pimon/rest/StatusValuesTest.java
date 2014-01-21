package au.com.jaylin.pimon.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatusValuesTest {

	@Test
	public void testGetStatusAsEnumForSuccess() {
		StatusValues enumVal = StatusValues.getStatusAsEnum("success");
		assertEquals(enumVal, StatusValues.success);
	}
	
	@Test
	public void testGetStatusAsEnumForSystemError() {
		StatusValues enumVal = StatusValues.getStatusAsEnum("system error");
		assertEquals(enumVal, StatusValues.systemerror);
	}
	
	@Test
	public void testGetStatusAsEnumForSystemErrorNoWhitespace() {
		StatusValues enumVal = StatusValues.getStatusAsEnum("systemerror");
		assertEquals(enumVal, StatusValues.systemerror);
	}
	
	@Test
	public void testGetStatusAsEnumForInvalidValue() {
		StatusValues enumVal = StatusValues.getStatusAsEnum("Xsystemerror");
		assertEquals(enumVal, StatusValues.NONE);
	}

	@Test
	public void testFormatStatusSuccess() {
		StatusValues statEnum = StatusValues.success;
		assertEquals("success", StatusValues.format(statEnum));
	}

	@Test
	public void testFormatStatusSystemError() {
		StatusValues statEnum = StatusValues.systemerror;
		assertEquals("system error", StatusValues.format(statEnum));
	}
	
	@Test
	public void testFormatStatusCancelled() {
		StatusValues statEnum = StatusValues.canceled;
		assertEquals("cancelled", StatusValues.format(statEnum));
	}
	
	@Test
	public void testFormatStatusDelivering() {
		StatusValues statEnum = StatusValues.delivering;
		assertEquals("delivering", StatusValues.format(statEnum));
	}
	
	@Test
	public void testFormatStatusWaiting() {
		StatusValues statEnum = StatusValues.waiting;
		assertEquals("waiting", StatusValues.format(statEnum));
	}
}
