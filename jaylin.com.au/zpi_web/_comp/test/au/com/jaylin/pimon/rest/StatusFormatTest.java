package au.com.jaylin.pimon.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatusFormatTest {

	@Test
	public void testStatusFormatForSuccess() {
		StatusFormat formatter = new StatusFormat();
		
		assertEquals("success", formatter.format(StatusValues.success));
	}

	@Test
	public void testStatusFormatForSystemError() {
		StatusFormat formatter = new StatusFormat();
		
		assertEquals("system error", formatter.format(StatusValues.systemerror));
	}
	
	@Test
	public void testStatusFormatForCancelled() {
		StatusFormat formatter = new StatusFormat();
		
		assertEquals("cancelled", formatter.format(StatusValues.canceled));
	}
	
	@Test
	public void testStatusFormatForWaiting() {
		StatusFormat formatter = new StatusFormat();
		
		assertEquals("waiting", formatter.format(StatusValues.waiting));
	}
	
	@Test
	public void testStatusFormatForDelivering() {
		StatusFormat formatter = new StatusFormat();
		
		assertEquals("delivering", formatter.format(StatusValues.delivering));
	}
}
