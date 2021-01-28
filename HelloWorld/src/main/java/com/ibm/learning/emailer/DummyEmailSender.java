package com.ibm.learning.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.context.annotation.Primary;

public class DummyEmailSender implements IEmailerService {

	//initialize the logger
	private static Log Log=LogFactory.getLog(DummyEmailSender.class);
	@Override
	public void sendEmail(String emailId, String subject, String mailContent) {
		// TODO Auto-generated method stub
		Log.info("Dummy Mail receiver ID:"+emailId);
		Log.info("Dummy Mail Subject:"+subject);
		Log.info("Dummy Mail body:"+mailContent);
		Log.warn("This is just a Dummy mail sender");
		
	}

}
