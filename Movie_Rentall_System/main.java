package Movie_Rentall_System;

public class main {
    public static void main(String[] args) {
        movieRentalSystem rentalSystem = new movieRentalSystem();


        Movie movie1 = new Movie("Inception", "Sci-Fi", true);
        Movie movie2 = new Movie("The Dark Knight", "Action",false);


        rentalSystem.addMovie(movie1);
        rentalSystem.addMovie(movie2);


        Movie searchedMovie = rentalSystem.searchMovieByTitle("Inception");
        if (searchedMovie != null) {
            System.out.println("Movie found: " + searchedMovie.getTitle());
        } else {
            System.out.println("Movie not found.");
        }


        rentalSystem.removeMovie(movie1);


        searchedMovie = rentalSystem.searchMovieByTitle("Inception");
        if (searchedMovie != null) {
            System.out.println("Movie found: " + searchedMovie.getTitle());
        } else {
            System.out.println("Movie not found.");
        }
    }
}
