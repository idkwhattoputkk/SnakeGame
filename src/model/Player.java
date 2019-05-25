package model;

import java.io.Serializable;
import java.util.ArrayList;


public class Player implements Serializable, Comparable {
	
	private static final long serialVersionUID = 1L;
	//attributes
	private String nickName;
	private int score;
	private int level;
	private Player left;
	private Player right;
	
	
	//methods
	public Player(String nickName) {
		super();
		level = 1;
		this.nickName = nickName;
		left = null;
		right = null;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Player getLeft() {
		return left;
	}
	public void setLeft(Player left) {
		this.left = left;
	}
	public Player getRight() {
		return right;
	}
	public void setRight(Player right) {
		this.right = right;
	}
	
	public int compareByName(String nombre) {
		return this.nickName.compareToIgnoreCase(nombre);
	}
	
	public Player searchByName (String nombre) {
		Player p = this;
		while (p!=null) {
			int comp = p.compareByName(nombre);
			
			if (comp == 0) {
				return p;
			}else if (comp>0) {
				p=p.left;
			}else {
				p=p.right;
			}
		}
		return null;
	}
	public void insert (Player p) throws PlayerRepetidoException{
		if (compareByName(p.getNickName())==0) {
			throw new PlayerRepetidoException (this);
		}else if (compareByName(p.getNickName())>0) {
			if (left == null)
				left = p;
			else
				left.insert(p);
		}else {
			if (right==null)
				right=p;
			else
				right.insert(p);
		}
	}
	public void crearArreglo(ArrayList<Player> a) {
		if(left != null) {
			left.crearArreglo(a);
		}
		a.add(this);
		if(right != null) {
			right.crearArreglo(a);
		}
	}
	public Player searchByScore(int score) {
		Player p = this;
		while (p!=null) {			
			if (score == p.score) {
				return p;
			}else if (score<p.score) {
				p=p.left;
			}else {
				p=p.right;
			}
		}
		return null;
	}
	public Player searchByLevel(int level){
		Player p = this;
		while (p!=null) {			
			if (level == p.level) {
				return p;
			}else if (level<p.level) {
				p=p.left;
			}else {
				p=p.right;
			}
		}
		return null;
	}

	@Override
	public boolean equals(Object o) {
		Player p = (Player)o;
		return this.score == p.getScore() && this.nickName.equals(p.getNickName());
	}
	@Override
	public String toString () {
		return nickName +" - "+score+" - "+level;
	}

	@Override
	public int compareTo(Object o) {
		Player p = (Player)o;
		return this.score-p.getScore();
	}
}
