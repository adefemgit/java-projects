package ProjectOne;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book bookInLibrary){

            books.add(bookInLibrary);
            System.out.println("Book added to the library" + bookInLibrary.getTitle());


    }

    public void removeBook(Book bookInLibrary){
            books.remove(bookInLibrary);
            System.out.println("Book removed.");
    }

    void displayBooks(){

            if(books.isEmpty()){
                System.out.println("No book in th library");


            }
            else{
                for(Book bookInLibrary : books){
                    System.out.println("- " + bookInLibrary.getTitle() + " (ISBN: " + bookInLibrary.getIsbn() + ")");

                }
            }
        }
    }








