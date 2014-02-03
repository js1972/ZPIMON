package au.com.jaylin.pimon.rest;

public class StatusFormat {
	public String format(StatusValues status) {
		String displayStatus = "";
		
		switch (status) {
		case success:
			displayStatus = "success";
			break;
			
		case canceled:
			displayStatus = "cancelled";
			break;
			
		case delivering:
			displayStatus = "delivering";
			break;
			
		case systemerror:
			displayStatus = "system error";
			break;
			
		case waiting:
			displayStatus = "waiting";
			break;
			
		case transfertoexternalapplication:
			displayStatus = "error in erp -> ppo";
			break;
			
		case erppostingerror:
			displayStatus = "erp error";
			break;
			
		case processedsuccessfully:
			displayStatus = "success";
			break;
		
		case holding:
			displayStatus = "holding";
			break;
			
		default:
			displayStatus = "unrecognised status enum:" + status;
			break;
			
		}
		
		return displayStatus;
	}
}
