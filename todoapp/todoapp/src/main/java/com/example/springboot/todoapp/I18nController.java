package com.example.springboot.todoapp;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class I18nController {
	
	private MessageSource messageSource;
	
	public I18nController(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}



	@GetMapping("/swagat")
	public String welcome() {
		//This will take the default locale if user doesn't provide anything in Accept-Language header
		Locale locale = LocaleContextHolder.getLocale();
		String msg = messageSource.getMessage("welcome.message", null,"Default Message", locale);
		return msg;
	}

}
