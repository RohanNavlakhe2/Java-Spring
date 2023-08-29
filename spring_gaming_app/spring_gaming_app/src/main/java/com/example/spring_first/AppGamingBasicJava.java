package com.example.spring_first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring_first.game.ContraGame;
import com.example.spring_first.game.GameRunner;
import com.example.spring_first.game.MarioGame;

@Configuration
@ComponentScan("com.example.spring_first.game")
public class AppGamingBasicJava {

	public static void main(String[] args) {
		// Create Spring Container

		try (var context = new AnnotationConfigApplicationContext(AppGamingBasicJava.class)) {
			var gameRunner = context.getBean(GameRunner.class);
			gameRunner.run();

		}

	}

}
