package ProjectOne;

public class main {
    public static void main(String [] args){
        Library library = new Library();
        Book book1 = new Book("j.hempson", "lets fly", 12321, true);
        Book book2 = new Book("crawford", "yellow sun", 43234, true);
        Book book3 = new Book("lolipop", "a way", 43235, false);

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.removeBook(book1);
        library.displayBooks();


        library.removeBook(book2);
        library.displayBooks();
    }
}
