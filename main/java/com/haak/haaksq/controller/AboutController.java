package com.haak.haaksq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

	@RequestMapping("/about.htm")
	public String redirect()
	{
		return "about";
	}
}
