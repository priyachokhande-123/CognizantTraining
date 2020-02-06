package com.cts.services;

import org.springframework.stereotype.Component;

@Component
public class ProfessionalFortune implements IFortuneService {

	@Override
	public String dailyFortune() {
		// TODO Auto-generated method stub
		return "today team lead is on leave";
	}

}
