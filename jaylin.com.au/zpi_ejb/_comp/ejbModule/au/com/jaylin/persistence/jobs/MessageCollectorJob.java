package au.com.jaylin.persistence.jobs;


import com.sap.scheduler.runtime.mdb.MDBJobImplementation;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import com.sap.scheduler.runtime.JobContext;
import com.sap.tc.logging.Location;

import au.com.jaylin.persistence.ejbs.*;
import au.com.jaylin.persistence.ejbs.helpers.OperationStatus;

/**
 * Message-Driven Bean implementation class for: MessageCollectorJob
 * NetWeaver scheduled job. Invokes method on PIMessageHandler to load up the latest PI messages and cache these for use in PI monitor.
 */
@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "messageSelector", propertyValue = "JobDefinition=\'MessageCollectorJob\' AND ApplicationName=\'jaylin.com.au/zpi_app\'") })
public class MessageCollectorJob extends MDBJobImplementation {
	
	private static final Location logger = Location.getLocation("au.com.jaylin.persistence.jobs.MessageCollectorJob");
	@EJB PIMessageHandlerLocal msgHandler;
	
    public MessageCollectorJob() {
        // TODO Auto-generated constructor stub
    }

	
	@Override
	public void onJob(JobContext jobContext) throws Exception {
		logger.infoT("Job execution started");
		OperationStatus opStatus = msgHandler.readPIDataAndCache();
		
		if(opStatus.status.equalsIgnoreCase("SUCCESS")) {
			logger.infoT("Successfully refreshed PI Data");	
		} else {
			logger.errorT("Error refreshing PI Data, status: " + opStatus.status);
		}
		logger.infoT("Job execution finished");
	}

}
