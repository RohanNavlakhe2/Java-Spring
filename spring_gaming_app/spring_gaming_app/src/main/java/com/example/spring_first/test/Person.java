package com.example.spring_first.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
  @Autowired
  //@Qualifier("samsungMobile")
  @Qualifier("AppleQualifier")
  Mobile mobile;
  
}
