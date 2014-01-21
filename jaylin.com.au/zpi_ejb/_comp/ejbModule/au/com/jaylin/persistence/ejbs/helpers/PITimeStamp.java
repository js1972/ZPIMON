package au.com.jaylin.persistence.ejbs.helpers;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class PITimeStamp {
	public static final int SLIDING_WINDOW_DAYS = -1; //Number of days to go back when selecting PI messages
	public static final String XML_NODE_NAME_DATE_FROM = "ns2:fromTime";
	public static final String XML_NODE_NAME_DATE_TO = "ns2:toTime";
	public static final int INITIAL_START_YEAR = 2013;
	public static final int INITIAL_START_MONTH = 8;  //0-based
	public static final int INITIAL_START_DAY = 15;

	public enum FilterOpts {
		last_hour,
	    today,
	    yesterday,
	    week,
	    last_week,
	    month,
	    year,
	    others
	}
	
	public enum TimeStampType {
		from,
		to
	}
	
	/**
	 * Default constructor
	 */
	public PITimeStamp() {
	}
	
	/** 
	 * Given a fixed-filter string containing an allowed enum
	 * value; return the begin and end time-stamps as Date objects
	 * in a Map.
	 * 
     * Note: In Java 1.6 and earlier it is not possible to switch
     * on Strings. As a work-a-round we can use enums.
     *  
	 * @param filter
	 * @return
	 */
	public Map<String, Date> buildTimestamps(String filter) {
		Map<String, Date> m = new HashMap<String, Date>();
    	FilterOpts enumval = null;
    	GregorianCalendar c = new GregorianCalendar();
    	int dayOfWeek;
    	
    	try {
    		enumval = FilterOpts.valueOf(filter);
    	}
    	catch (Exception e) {
    		// Exceptions are thrown by valueOf if the filter String does
    		// not contain one of the enum values.
    		throw new TimestampException("Invalid filter value: " + filter);
    	}
    	
    	switch (enumval) {
		case last_hour:
			c.setTime(new Date());
	    	c.add(Calendar.HOUR_OF_DAY, -1);
			m.put("begin", c.getTime());
	    	m.put("end", new Date());
			break;
		case today:
			c.setTime(new Date());
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
			m.put("begin", c.getTime());
			
			c.setTime(new Date());
			c.add(Calendar.DAY_OF_WEEK, 1);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	m.put("end", c.getTime());
			break;
		case yesterday:
			c.setTime(new Date());
			c.add(Calendar.DAY_OF_WEEK, -1);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
			m.put("begin", c.getTime());
			
			c.setTime(new Date());
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	m.put("end", c.getTime());
			break;
		case week:
			c.setTime(new Date());
			dayOfWeek = c.getFirstDayOfWeek() + 1;
			c.set(Calendar.DAY_OF_WEEK, dayOfWeek);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
			m.put("begin", c.getTime());
			
			c.setTime(new Date());
			c.add(Calendar.WEEK_OF_YEAR, 1);
			dayOfWeek = c.getFirstDayOfWeek() + 1;
			c.set(Calendar.DAY_OF_WEEK, dayOfWeek);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	m.put("end", c.getTime());
			break;
		case last_week:
			c.setTime(new Date());
			dayOfWeek = c.getFirstDayOfWeek() + 1;
			c.set(Calendar.DAY_OF_WEEK, dayOfWeek);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	c.add(Calendar.WEEK_OF_YEAR, -1);
			m.put("begin", c.getTime());
			
			c.setTime(new Date());
			c.add(Calendar.WEEK_OF_YEAR, 1);
			dayOfWeek = c.getFirstDayOfWeek() + 1;
			c.set(Calendar.DAY_OF_WEEK, dayOfWeek);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	c.add(Calendar.WEEK_OF_YEAR, -1);
	    	m.put("end", c.getTime());
			break;
		case month:
			c.setTime(new Date());
			c.set(Calendar.DAY_OF_MONTH, 1);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
			m.put("begin", c.getTime());
			
			c.setTime(new Date());
			c.set(Calendar.DAY_OF_MONTH, 1);
	    	c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	c.add(Calendar.MONTH, 1);
	    	m.put("end", c.getTime());
			break;
		case year:
			c.setTime(new Date());
			c.set(Calendar.MONTH, 0);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	m.put("begin", c.getTime());
	    	
	    	c.setTime(new Date());
			c.set(Calendar.MONTH, 0);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.HOUR_OF_DAY, 0);
	    	c.set(Calendar.MINUTE, 0);
	    	c.set(Calendar.SECOND, 0);
	    	c.add(Calendar.YEAR, 1);
	    	m.put("end", c.getTime());
			break;
		case others:
			break;
		default:
			break;
		}
    	
    	return m;
	}
	
	/**
	 * Used to build the timestamp map when a custom date range is provided rather than one of the enumeration values.
	 * @param dateFrom
	 * @param dateTo
	 * @return map containing start and end date
	 */
	public Map<String, Date> buildCustomTimestamps(Date dateFrom, Date dateTo) {
		Map<String, Date> m = new HashMap<String, Date>();

    	m.put("begin", dateFrom);
    	m.put("end", dateTo);
    	
    	return m;
	}
	
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
	
	/**
	 * Convert a Date object to its XML representation.
	 * 
	 * @param timestamp (Date object)
	 * @param type - Enumeration of "from", "to" to decide which type of time-stamp to build
	 * @return JAXB Element containing the XML representation of a Calendar
	 */
	public JAXBElement<XMLGregorianCalendar> getXMLTimeStampWithSlidingWindow(Date timestamp, TimeStampType type) {
		GregorianCalendar calendar = new GregorianCalendar();
		XMLGregorianCalendar dateFrom = null;
		QName xmlNodeName = null;
		
		calendar.setTime(timestamp);
    	if (type == TimeStampType.from) {
    		calendar.add(Calendar.DAY_OF_YEAR, PITimeStamp.SLIDING_WINDOW_DAYS);
    	}
    	
		dateFrom = createXMLGregorianCalendarFromDate(calendar.getTime());   	

		//try {
		//	dateFrom = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		//} catch (DatatypeConfigurationException e1) {
		//	e1.printStackTrace();
		//}
		xmlNodeName = new QName((type == TimeStampType.from)? PITimeStamp.XML_NODE_NAME_DATE_FROM : PITimeStamp.XML_NODE_NAME_DATE_TO);
		
    	return new JAXBElement<XMLGregorianCalendar>(xmlNodeName, XMLGregorianCalendar.class, dateFrom);
	}
}
