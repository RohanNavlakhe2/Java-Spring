package com.example.spring_first.namaste_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) {}
record Address(String street,String city) {}

@Configuration
public class NamasteSpringConfiguration {
	
	@Bean
	public String name() {
		return "Rohan";
	}
	
	@Bean int age() {
		return 24;
	}
	
	//Getting name and age by calling methods
	@Bean
	public Person personWithMethodCall() {
		return new Person(name(),age(),getPersonAddress());
	}
	
	//Getting name, age and address by directly providing as parameters 
	//(This provides name and age same as Dagger Hilt does)
	@Bean
	public Person person(String name,int age,Address address) {
		return new Person(name,age,address);
	}
	
	@Bean(name = "address")
	public Address getPersonAddress() {
		return new Address("Mahajanapeth","Burhanpur");
	}
	
	 
	
	
	
	

}
