package model;

import java.awt.event.KeyEvent;

import model.Snake.Dir;

public class Snake extends SpriteMovement implements Colisionable, Movible{
	public final static int SPEED =5;
	public final static int SIZE = 25;
	
	private double height;
	private double width;
	private boolean visible;
	private Dir direction;
	
	//methods
	public enum Dir {
		left, right, up, down
	}
	public Snake() {
		super(10,10);
		visible = true;
		height=SIZE-1;
		width=SIZE-1;
		
		
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	@Override
	public boolean isColision(Colisionable c) {
		boolean flag = true;
		if(c instanceof Food) {
			if(((Food) c).getX() == this.getdX() && ((Food)c).getY()==this.getdY()) {
				flag=true;
			}
		}
		return flag;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public Dir getDirection() {
		return direction;
	}

	public void setDirection(Dir direction) {
		this.direction = direction;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public void hayColision(Colisionable c) {
		if(c instanceof Food) {
			makeBigger();
		}
		
	}

	private void makeBigger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		if(direction==Dir.left) {
			int nX=getdX();	
			nX--;
			setdX(nX);
			}
		else if(direction==Dir.right) {
			int nX=getdX();
			nX++;
			setdX(nX);
		}
		else if (direction==Dir.up) {
			int nY=getdX();
			nY--;
			setdY(nY);
		}else if(direction==Dir.down) {
			int nY=getdX();
			nY++;
			setdY(nY);
		}
	}
}
