package Movie_Rentall_System;

public class Movie {

    String title;
    String genre;
    boolean isAvailable;


    public Movie(String title, String genre, boolean isAvailable){
        this.title = title;
        this.genre = genre;
        this.isAvailable = isAvailable;


    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public String setTitle(){
        return title;
    }

    public String setGenre(){
        return genre;
    }

    public String toString(){
        return "Title: " + title + "\n" +
                "Genre: " + genre + "\n" +
                "availability: " + isAvailable + "\n";

     }

}
