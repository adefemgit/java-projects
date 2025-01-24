package WK1_TEST;

public class Exercise7 {
    public static void main(String [] args){
        String str = "w3rsource.com";

        int val1 = str.codePointCount(1,10);
        System.out.println("codepoint = " + val1);
    }
}
//Write a Java program to count Unicode code points in the specified text range of a string.
