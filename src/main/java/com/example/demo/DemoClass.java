package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClass {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to real Spring";
	}

}
