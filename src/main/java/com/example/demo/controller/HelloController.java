package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping({ "/hello" })
	public String firstPage(Principal principal) {
		return principal.getName();
	}
}
