package com.example.springboot.todoapp.util.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint(validatedBy = AtLeastOneNotBlankValidator.class)
@Target({ ElementType.TYPE })
//@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AtLeastOneNotBlank {
	
	String message() default "At least one field should be non-blank";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
	
	 String[] value();
}
