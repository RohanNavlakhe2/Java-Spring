package com.example.spring_first.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

record Car(String name) {}

@Configuration
@ComponentScan("com.example.spring_first.test")
public class Test {
	
	public static void main(String[] args) {
       try(var context =
    		   new AnnotationConfigApplicationContext(Test.class)){
    	   var person = context.getBean(Person.class);
    	   person.mobile.boot();
       }
       
       var car = new Car("");
	}
}
