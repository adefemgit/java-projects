package WK1_TEST;

public class Exercise5 {
    public static void main(String [] args){
        String str = "w3resource.com";

        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(9);

        System.out.println("character unicode is " + val1);
        System.out.println("character unicode is " + val2);
    }
}
