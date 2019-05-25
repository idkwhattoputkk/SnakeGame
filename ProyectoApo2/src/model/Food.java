package model;

import javafx.scene.paint.Color;

public class Food {
	private Color color;
	private int x;
	private int y;
	private int radious;
	
	
	public Food(Color color, int x, int y, int radious) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.radious = radious;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadious() {
		return radious;
	}
	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	
	
}
