package com.cts.services;

import org.springframework.stereotype.Component;

@Component
public class PersonalFortune implements IFortuneService {

	@Override
	public String dailyFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day";
	}

}
