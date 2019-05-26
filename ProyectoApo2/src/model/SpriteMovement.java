package model;

public abstract class SpriteMovement implements Movible{
	private int dX;
	private int dY;
	
	public SpriteMovement(int dX, int dY) {
		this.dX=dX;
		this.dY=dY;
	}

	public int getdX() {
		return dX;
	}

	public void setdX(int dX) {
		this.dX = dX;
	}

	public int getdY() {
		return dY;
	}

	public void setdY(int dY) {
		this.dY = dY;
	}
	@Override
	public void move() {}
	
}
