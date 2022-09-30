package com.L3_1team.health.Utility.Page;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class OtpMailSender {
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public boolean sendMail(String title, String msg, String fromEmail, String toEmail) {
		SimpleMailMessage message = new SimpleMailMessage();		
		boolean messageStatus = false;
		
		try {
			message.setSubject(title);
			message.setText(msg);
			message.setFrom(fromEmail);
			message.setTo(toEmail);
			
			mailSender.send(message);
			messageStatus = true;
		} catch (MailException e) {			
		}
		
		return messageStatus;
	}
}
