package com.cts.lambdas;

class Sample
{
 void sendMessage(Greetings greetings, String message) {
 greetings.sendGreetings(message);
	}	
}
public class MyApp {
	

public static void main(String args[])
{
	Sample obj = new Sample();
	// obj.sendMessage("Hello All");
	Greetings email = new EmailGreetings();
	obj.sendMessage(email, "Hello All"); // passing functionality as object
	
	Greetings sms = new SmsGreetings();
	obj.sendMessage(sms, "Hello All"); // passing functionality as object
	
}
}