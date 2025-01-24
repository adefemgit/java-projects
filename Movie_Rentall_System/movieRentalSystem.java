package Movie_Rentall_System;

import java.util.ArrayList;

public class movieRentalSystem {

    ArrayList<Movie> movies = new ArrayList<>();


    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.println("Movie added: " + movie.getTitle());
    }

    public void removeMovie(Movie movie){
        movies.remove(movie);
        System.out.println("Movie removed : " + movie.getTitle());
    }

    public Movie searchMovieByTitle(String title){
        for(Movie movie : movies){
            if(movie.getTitle().equalsIgnoreCase(title)){
                return movie;

            }

        }
        return null;
    }
}
