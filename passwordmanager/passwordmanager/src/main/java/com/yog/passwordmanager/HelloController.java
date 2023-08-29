package com.yog.passwordmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to password manager";
	}
	
	@GetMapping("/welcome2")
	public String welcome2() {
		return "Welcome to password manager 2";
	}
	
	

}
