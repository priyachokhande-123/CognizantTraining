package com.cts.lambdas;

public class EmailGreetings implements Greetings {

	@Override
	public void sendGreetings(String message) {
		System.out.println("Greetings send over an email: "+message);
		
	}

}
