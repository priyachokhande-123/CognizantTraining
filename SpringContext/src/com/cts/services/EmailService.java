package com.cts.services;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements IMessageService{

	@Override
	public String sendMessage(String to, String message) {
		return "Email sent to : " + to + "[ * " + message + " * ]";
	}

}
