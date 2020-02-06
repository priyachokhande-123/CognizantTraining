package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msgService")
public class EmailService implements IMessageService{
private IFortuneService fortuneService;
	

	@Autowired
	@Qualifier("personalFortune")
	public void xyz(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String sendMessage(String to, String message) {
		return "Email sent to : " + to + "[ * " + message + " * ]";
	}

}
