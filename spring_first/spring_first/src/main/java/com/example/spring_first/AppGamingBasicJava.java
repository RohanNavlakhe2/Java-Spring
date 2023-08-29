package com.example.spring_first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_first.game.ContraGame;
import com.example.spring_first.game.GameRunner;
import com.example.spring_first.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// Create Spring Container

		try (var context = new AnnotationConfigApplicationContext(GamingSpringConfiguaration.class)) {
//          MarioGame marioGame = (MarioGame) context.getBean("marioGame");
//          var gameRunner = new GameRunner(marioGame);
//          gameRunner.run();
//          
//          ContraGame contraGame = (ContraGame) context.getBean("contraGame");
//          var gameRunner2 = new GameRunner(contraGame);
//          gameRunner2.run();
          
          GameRunner marioGameRunner = (GameRunner) context.getBean("marioGameRunner");
          marioGameRunner.run();
          
          
		}

	}

}
