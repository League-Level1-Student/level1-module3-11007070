package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		//Actor actor = new Actor();
		Location locbug = new Location(5, 5);
		world.add(locbug,bug);
		
		Bug bug2 = new Bug();
		Random ran = new Random();
		int x = ran.nextInt(10);
		int y = ran.nextInt(10);
		Location loc2 = new Location(x, y);
		world.add(loc2, bug2);
		bug2.setColor(Color.BLUE);
		bug2.turn();
		bug2.turn();
		
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		Location locflo1 = new Location(x, y-1);
		Location locflo2 = new Location(x, y+1);
		world.add(locflo1, flower1);
		world.add(locflo2, flower2);
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
					Flower flo = new Flower();
					Location loc = new Location(i,j);
					world.add(loc, flo);
			}
		}
	}
}
