package com.example.spring_first.namaste_spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NamasteSpring {

	public static void main(String[] args) {
		
		try (//Creating a Spring Context with Configuaration file
		var context = new AnnotationConfigApplicationContext(NamasteSpringConfiguration.class)) {
			//Getting a name bean
			 //Here "name" is a @Bean method name defined in SpringConfiguaration file
			 var nameBean = context.getBean("name");
			 System.out.println(nameBean);
			 
			 
			 var person = context.getBean("person");
			 System.out.println(person);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
