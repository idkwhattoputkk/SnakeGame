package threads;

import model.Game;

public class gameThread extends Thread{
	private Game Snake;

	public gameThread(Game snake) {
		super();
		this.Snake = snake;
	}
	
	
}
