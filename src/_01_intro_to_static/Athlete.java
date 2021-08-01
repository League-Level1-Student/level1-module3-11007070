package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        this.bibNumber = nextBibNumber;
        this.nextBibNumber++;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete a1 = new Athlete("Bob", 5);
    	System.out.println(a1.name + " is running at " + Athlete.raceLocation + " with number " + a1.bibNumber);
    	Athlete a2 = new Athlete("Steve", 7);
    	System.out.println(a2.name + " is running at " + Athlete.raceLocation + " with number " + a2.bibNumber);
        //print their names, bibNumbers, and the location of their race. 
    }
}
