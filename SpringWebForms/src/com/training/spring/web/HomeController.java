package com.training.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//register as controller under handler mapper
@Controller
public class HomeController {
 //url mapping for request / index this method will handle that request and it called automatically
	 
	@RequestMapping("/")
	public String home()
	{
		//must always return view name
		return "home-page";
		
	}
	@RequestMapping("/index")
	public String index()
	{
		//must always return view name
		return "index-page";
		
	}
}
