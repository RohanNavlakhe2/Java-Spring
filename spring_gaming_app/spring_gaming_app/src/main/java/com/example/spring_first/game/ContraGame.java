package com.example.spring_first.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("contra") 
public class ContraGame implements Game {

	@Override
	public void run() {
	  System.out.println("Run Contra Game");
	}

}
