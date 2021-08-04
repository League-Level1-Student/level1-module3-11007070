package _05_netflix;

public class NetflixRunner {
public static void main(String[] args) {
	Movie TFATF = new Movie("The Fast and The Furious", 4);
	Movie AvengersEnd = new Movie("Avengers Endgame", 5);
	Movie AQP = new Movie("A Quite Place", 2);
	Movie MonstersInc = new Movie("Monsters Inc.", 3);
	Movie Twilight = new Movie("Twilight", 1);
	
	System.out.println("For the movie " + AvengersEnd + ": " + AvengersEnd.getTicketPrice());
	
	NetflixQueue NQ = new NetflixQueue();
	
	NQ.addMovie(TFATF);
	NQ.addMovie(AvengersEnd);
	NQ.addMovie(AQP);
	NQ.addMovie(MonstersInc);
	NQ.addMovie(Twilight);
	NQ.printMovies();
	System.out.println("The best movie is... " + NQ.getBestMovie());
	System.out.println("The second best movie is ... " + NQ.getSecondBestMovie());
}
}
