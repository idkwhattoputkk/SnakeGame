package model;

import javax.sound.sampled.Clip;

public class Game {
	private int Score;
	private Player rootPlayer;
	private Food bocaditos;
	private Clip songAmbiente;
	private int level;
	private Player player;
	
	
	public Game() {
		super();
		level =1;
		player = new Player(null);
		rootPlayer = null;
		
	}
	public void startGame() {
		//TODO initialize the game;
	}

	public int getScore() {
		return Score;
	}


	public void setScore(int score) {
		Score = score;
	}


	public Player getRootPlayer() {
		return rootPlayer;
	}


	public void setRootPlayer(Player rootPlayer) {
		this.rootPlayer = rootPlayer;
	}


	public Food getBocaditos() {
		return bocaditos;
	}


	public void setBocaditos(Food bocaditos) {
		this.bocaditos = bocaditos;
	}


	public Clip getSongAmbiente() {
		return songAmbiente;
	}


	public void setSongAmbiente(Clip songAmbiente) {
		this.songAmbiente = songAmbiente;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
}
