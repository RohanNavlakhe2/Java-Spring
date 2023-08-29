package com.example.spring_first.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements Game {

	@Override
	public void run() {
		System.out.println("Run Mario Game");
	}

}
