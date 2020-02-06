package com.cts.client;

import com.cts.services.EmailService;

public class MyApp {


public static void main(String[] args) {
	EmailService emailService=new EmailService();
	String ack=emailService.sendMessage("a@gmail.com","hello");
	System.out.println(ack);
}
}
