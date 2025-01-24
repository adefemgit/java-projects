package WK1_TEST;

public class Exercise3 {
    public static void main(String [] args){
        String s = "Call me Ishmael. ";
        System.out.println(s);
        System.out.println("The length of this string is = " + s.length());
        System.out.println("The first character is = " + s.charAt(0));
        System.out.println("The last character is = " + s.charAt(s.length() - 1));
        System.out.println("The first word in the string is " + s.substring(0, s.indexOf(' ')));

    }
}
