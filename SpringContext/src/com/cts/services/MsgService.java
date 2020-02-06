package com.cts.services;

public class MsgService implements IMessageService {

	@Override
	public String sendMessage(String to, String message) {
		
		return "SMS sent to : " + to + "[ * " + message + " * ]";
	}

}
