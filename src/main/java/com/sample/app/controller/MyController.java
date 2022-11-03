package com.sample.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/message")
	public String getData() {
		return "Hello from Controller! :8081";
	}
}