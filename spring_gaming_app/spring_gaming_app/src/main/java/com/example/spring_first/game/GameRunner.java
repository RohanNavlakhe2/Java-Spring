package com.example.spring_first.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private Game game;

	public GameRunner(@Qualifier("contra") Game game) {
		this.game = game;
	}

	public void run() {
		 game.run();
	}

}
