package _05_netflix;

public class MovieTicket {
public static void main(String[] args) {
	
	
	Movie movie1 = new Movie("Black Panther", 5);
	Movie movie2 = new Movie("Toy Story 3", 3);
	Movie movie3 = new Movie("Infinity War", 2);
	Movie movie4 = new Movie("Spiderman", 4);
	Movie movie5 = new Movie("James Bond", 1);
	
	
	NetflixQueue queue1 = new NetflixQueue();
	
	movie1.getTicketPrice();
	queue1.addMovie(movie1);
	queue1.addMovie(movie2);
	queue1.addMovie(movie3);
	queue1.addMovie(movie4);
	queue1.addMovie(movie5);
	queue1.printMovies();
	System.out.println("The best movie is " + queue1.getBestMovie());
	queue1.sortMoviesByRating();
	
	
	System.out.println("The second best movie is " + queue1.getMovie(1));
	
	
	
	
}
}
