package au.com.jaylin.pimon.rest;

import java.util.Map;

public class PIStatistics {
	//these values are based on last 30 days
	public int iflowPerDay;
	public int iflowErrorsPerDay;
	public int iflowOutstandingErrors;
	
	public int messagePerDay;
	public int messageErrorsPerDay;
	public int messageOutstandingErrors;
	
	//these values are all-time
	public long errorsAllTime;
	public long deliveringAllTime;
	public Map<Long, Integer> messageTimeSeries;
}
