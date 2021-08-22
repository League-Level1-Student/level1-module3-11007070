package _06_gridworld;

import info.gridworld.actor.Actor;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Actor actor = new Actor();
		Location locbug = new Location(25, 25);
		world.add(locbug, actor);
	}
}
