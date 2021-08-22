package _06_gridworld;

import java.awt.Color;

public class Bug {
	public Color color = Color.RED;
	
	public Bug() {
		System.out.println("Bug: A " + color + " bug has been made.");
	}
	
	public Bug(Color bugcolor) {
		System.out.println("Bug: A " + bugcolor + " bug has been made.");
		this.color = bugcolor;
	}
}
