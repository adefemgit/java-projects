package WK1_TEST;

public class Exercise6 {
    public static void main(String [] args){
        String str = "w3resource.com";

        int val1 = str.codePointBefore(1);
        int val2 = str.codePointBefore(9);

        System.out.println("character(unicode point) = " + val1);
        System.out.println("character(unicode point) = " + val2);


    }
}
