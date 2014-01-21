package au.com.jaylin.pimon.rest;

public enum StatusValues {
	NONE,
	success,
	processedsuccessfully,
	systemerror,
	waiting,
	delivering,
	transfertoexternalapplication,
	canceled,
	erppostingerror;
	
	public static StatusValues getStatusAsEnum(String status) {
		StatusValues enumVal = StatusValues.NONE;
		String cleanStatus = status.replaceAll("\\s+","");  // Remove all whitespace
		
		cleanStatus = cleanStatus.toLowerCase();
		try {
			enumVal = StatusValues.valueOf(cleanStatus);
		}
		catch (Exception e) {
			//do nothing for now... an invalid PI status was found
		}
		
		return enumVal;
	}
	
	public static String format(StatusValues statusEnum) {
		String displayStatus = "";
		
		switch (statusEnum) {
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
		default:
			displayStatus = "unrecognised status enum:" + statusEnum;
			break;
		}
		
		return displayStatus;
	}
}
