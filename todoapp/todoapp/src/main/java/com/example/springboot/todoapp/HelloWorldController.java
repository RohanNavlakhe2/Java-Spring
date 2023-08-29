package com.example.springboot.todoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping("/hello-world-jsp")
	public String helloWorldJsp() {
		return "helloWorld";
	}

}
