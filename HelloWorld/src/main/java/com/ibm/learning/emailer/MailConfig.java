package com.ibm.learning.emailer;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;


@Configuration
public class MailConfig {
	/*@Bean	
	@Profile("dev")
	public IEmailerService dummyEmailSender(JavaMailSender javaMailSender) {
		return new DummyEmailSender(javaMailSender);
	}*/
	
	@Bean
	@Profile("prod")
	public IEmailerService smtpEmailSender(JavaMailSender javaMailSender) {
		return new SmtpEmailSender(javaMailSender);
	}
}
