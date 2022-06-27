package com.Eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class empcontroller {
	
	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in first Service";
	}

}