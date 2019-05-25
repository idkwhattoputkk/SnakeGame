package model;

public class PlayerRepetidoException extends Exception {
	private static final long serialVersionUID = 2L;
	
	private Player p;
	
	public PlayerRepetidoException(Player player) {
		this.p=player;
	}
	public Player getPlayer() {
		return p;
	}

}
