package com.example.spring_first.test;

import org.springframework.stereotype.Component;

@Component
public class SamsungMobile extends Mobile {

	@Override
	public void boot() {
		System.out.println("Samsung boot");
		
	}

}
