package com.cts.services;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements IMessageService {

	@Override
	public String sendMessage(String to, String message) {
		return "sms sent to : " + to + "[ * " + message + " * ]";
	}

}
