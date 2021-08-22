package _06_gridworld;

public class Location {
	public int row;
	public int column;
	
	public Location(int row, int column) {
		this.row = row;
		this.column = column;
		System.out.println("Location: A location has been made at (" + row + "," + column + ")");
	}
}
