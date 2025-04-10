package com.example.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PinkaiController {

	@GetMapping("/")
	public String Viewindex() {
		return "home";
	}
	
}
