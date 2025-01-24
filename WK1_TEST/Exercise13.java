package WK1_TEST;

public class Exercise13 {
    public static void main(String [] args){
        char[] chr_array =  {'1', '2', '3', '4', '5'};

        String lin = String.copyValueOf(chr_array, 1, 3);

        System.out.println("The book contains " + lin + " pages");

    }
}
// Write a Java program to create a String object with a character array.