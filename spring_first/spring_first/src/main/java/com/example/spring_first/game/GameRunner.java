package com.example.spring_first.game;

public class GameRunner {

	private Game game;

	public GameRunner(Game game) {
		this.game = game;
	}

	public void run() {
		 game.run();
	}

}
