package com.cts.lambdas;

public class SmsGreetings implements Greetings{

	@Override
	public void sendGreetings(String message) {
		// TODO Auto-generated method stub
		System.out.println("Greetings are send over a sms: "+message);
	}

}
