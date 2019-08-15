package com.codyortiz.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloHumanController {
	
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required = false) String name, @RequestParam(value="last_name", required=false) String lastName) {
		if (name == null || lastName == null) {
			return "Hello Human! Welcome to SpringBoot";
		}
		else 
			return "Hello " + name + " " + lastName + "! Welcome to SpringBoot"; 
	}
}
