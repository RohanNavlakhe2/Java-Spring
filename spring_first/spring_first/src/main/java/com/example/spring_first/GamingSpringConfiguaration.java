package com.example.spring_first;

 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring_first.game.ContraGame;
import com.example.spring_first.game.Game;
import com.example.spring_first.game.GameRunner;
import com.example.spring_first.game.MarioGame;

@Configuration
public class GamingSpringConfiguaration {
	
	@Bean
	public GameRunner marioGameRunner(Game marioGame) {
		return new GameRunner(marioGame);
	}
	
	@Bean
	public GameRunner contraGameRunner(Game contraGame) {
		return new GameRunner(contraGame);
	}
	
	@Bean(name = "marioGame")
	public MarioGame getMarioGame() {
		return new MarioGame();
	
	}
	
	@Bean(name = "contraGame")
	public ContraGame getContraGame() {
		return new ContraGame();
	
	}
	
	
	
	
	


}
