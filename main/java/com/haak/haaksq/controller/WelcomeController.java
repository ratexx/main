package com.haak.haaksq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome.htm")
	public String redirect()
	{
		
		System.out.println("hello welcome ");
		
		return "contact";
	}
}
