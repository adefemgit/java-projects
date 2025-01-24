package ProjectOne;

public class Book {
    String title;
    String author;
    int isbn;
    boolean isAvailable;

    public Book(String title, String author, int isbn, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;

    }

    void borrowBook(){
        if(isAvailable){
            System.out.println("Book is available for borrowing");
            isAvailable = false;
        }
        else{
            System.out.println("This book has been borrowed, please come later");
        }
    }

    void returnBook(){
        if(!isAvailable){
            System.out.println("Thanks for returning the book");
            isAvailable = true;
        }
        else{
            System.out.println("This book was not borrowed, please contact the helpline, if there is a problem ");
        }
    }

    public String toString(){
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Isbn Number: " + isbn + "\n" +
                "Availability: " + isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }


}
