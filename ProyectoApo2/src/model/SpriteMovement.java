package model;

public abstract class SpriteMovement extends Sprite implements Movible {
	private int dX;
	private int dY;
	
	public SpriteMovement(int x, int y) {
		super(x, y);
		
	}
	@Override
	public void move() {
		 setX(getX()+dX);
		 setY(getY()+dY);
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
	
}
