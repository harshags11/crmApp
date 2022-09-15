package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String to, String sub, String body) {
		  try {
			  
	            SimpleMailMessage mailMessage
	                = new SimpleMailMessage();
	 
	            // Setting up necessary details
	            mailMessage.setTo(to);
	            mailMessage.setText(body);
	            mailMessage.setSubject(sub);
	 
	            // Sending the mail
	            javaMailSender.send(mailMessage);
	        }
	 
	        catch (Exception e) {
	        	e.printStackTrace();
	        }

	}

}
