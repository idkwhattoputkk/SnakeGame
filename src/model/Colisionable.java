package model;

import javafx.scene.shape.Circle;

public interface Colisionable {
	
	public boolean isColision(Colisionable c);
	public void colisionaWith(Colisionable c);
	
	public Circle getColision();
	
}
