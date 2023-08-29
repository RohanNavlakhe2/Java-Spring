package com.example.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springboot.todoapp.todo.Todo;

@Controller
public class LoginController {

	/*
	 * @RequestMapping("login") public String login(@RequestParam(name = "username")
	 * String name, ModelMap model) { model.put("username", name); return "login"; }
	 */
	
	@RequestMapping(value = "login-me",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "login-me",method = RequestMethod.POST)
	public String welcome(@RequestParam String name,@RequestParam String password,
			ModelMap model) {
		model.put("name",name);
		return "redirect:mytodos";
	}
	
	
}
