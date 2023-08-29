package com.example.springboot.todoapp.util.validation;

import org.slf4j.Logger;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

import com.example.springboot.todoapp.todo.Todo;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class AtLeastOneNotBlankValidator implements ConstraintValidator<AtLeastOneNotBlank,Todo> {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
	
	private String[] fields;
	 
	 @Override
	public void initialize(AtLeastOneNotBlank constraintAnnotation) {
		 logger.info("initialize");
		 fields = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(Todo todo, ConstraintValidatorContext context) {
		
		logger.info("isValid");
		var beanWrapper = new BeanWrapperImpl(todo);
		for(String field:fields) {
			 var value = beanWrapper.getPropertyValue(field);
			 if(value instanceof String && StringUtils.isNotEmpty((String)value)) {
				 return true;
			 }
			 
		}
		
		return false;
	}

}
