package model;

import javafx.scene.paint.Color;
import model.Snake.Dir;

public class Food implements Colisionable{
	public final static int SIZE = 25;
	private Color color;
	private int x;
	private int y;
	private int height;
	private int width;
	
	
	
	public Food(int x, int y, Color color) {
		super();
		this.x=x;
		this.y=y;
		this.color = color;
		height=4;
		width=4;
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
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public boolean isColision(Colisionable c) {
		boolean flag = true;
		if(c instanceof Snake) {
			if(((Snake) c).getdX() == this.getX() && ((Snake)c).getdY()==this.getY()) {
				flag=true;
			}
		}
		return flag;
	}
	@Override
	public void hayColision(Colisionable c) {}
	
	
	
}
