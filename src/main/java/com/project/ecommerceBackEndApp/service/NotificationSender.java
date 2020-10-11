package com.project.ecommerceBackEndApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.project.ecommerceBackEndApp.entity.Client;


@Service
public class NotificationSender {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendNotification(Client client) throws MailException{

		SimpleMailMessage mail = new SimpleMailMessage();

		mail.setTo("nafaa.youssef93@gmail.com");

		mail.setFrom("nafaa.youssef93@gmail.com");
		mail.setSubject(client.getSubject());
		mail.setText(client.getText());

		javaMailSender.send(mail);
		
	}

}
