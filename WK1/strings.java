package WK1;

public class strings {
    public static void main(String [] args){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet);
        System.out.println("The character at index 4 is " + alphabet.charAt(4));
        System.out.println("The index of the character z is " + alphabet.indexOf('Z'));
        System.out.println("The hash code for this string is " + alphabet.hashCode());

    }
}
