package com.cts.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.services.IMessageService;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");


IMessageService service = context.getBean("msgService", IMessageService.class);
String ack = service.sendMessage("someone", "Hello");
System.out.println(ack);


context.close();

	}

}
