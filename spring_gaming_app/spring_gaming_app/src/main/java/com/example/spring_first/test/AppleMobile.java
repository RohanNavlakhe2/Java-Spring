package com.example.spring_first.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("AppleQualifier")
public class AppleMobile extends Mobile {

	@Override
	public void boot() {
		 System.out.println("Apple Boot");
		
	}

}
