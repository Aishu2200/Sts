package com.ibm.learning.emailer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;



public class SmtpEmailSender implements IEmailerService{

	//initialize the logger
	private static Log Log=LogFactory.getLog(SmtpEmailSender.class);
	private JavaMailSender javaMailSender;
	public SmtpEmailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	@Override
	public void sendEmail(String emailId, String subject, String mailContent) throws MessagingException{
		// TODO Auto-generated method stub
		Log.info("SMTP Mail receiver ID:"+emailId);
		Log.info("SMTP Mail Subject:"+subject);
		Log.info("SMTP Mail body:"+mailContent);
		Log.warn("This is just a SMTP mail sender");
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;

		helper = new MimeMessageHelper(message, true); // true indicates
 					  				                   // multipart message
		helper.setSubject("This is test message");
		helper.setTo("sarti0798@gmail.com");
		helper.setText("<h1> Body </h1>", true); // true indicates html
        javaMailSender.send(message);
		// continue using helper for more functionalities
        // like adding attachments, etc.  
		
		
	}
}
