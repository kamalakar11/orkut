package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value="/")
	public String welcomePage() {
		System.out.println("welcome page request triggered!!");
		return "Home";
	}
}
