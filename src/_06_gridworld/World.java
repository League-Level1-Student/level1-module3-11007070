package _06_gridworld;

import info.gridworld.actor.Actor;

public class World {
	
	public World() {
		System.out.println("World: A world has been made.");
	}
	
	public void show() {
		System.out.println("World: The world is shown.");
	}
	
	public void add(Location loc, Actor occupant) {
		System.out.println("World: A " + occupant.getColor() + " " + occupant + " has been added to world at (" + loc.row + "," + loc.column + ")");
	}
}
