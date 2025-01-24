package WK1;

public class substrings {
    public static void main(String [] args){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The substring from index 4 to index 8 is " + alphabet.substring(4,8));
        System.out.println("The substring from index 4  to 4 is " + alphabet.substring(4,4));
        System.out.println("The substring from index 8 to the end is " + alphabet.substring(8));
    }
}
