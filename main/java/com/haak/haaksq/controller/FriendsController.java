package com.haak.haaksq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FriendsController {

	@RequestMapping("/friends.htm")
	public String redirect()
	{
		return "friends";
	}
}
