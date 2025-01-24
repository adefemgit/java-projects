package WK1_TEST;

public class Exercise9 {
    public static void main(String [] args){
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";

        int cmp = str1.compareToIgnoreCase(str2);

        if(cmp > 0){
            System.out.println(str1 + "is greater than " + str2);

        }

        else if(cmp == 0){
            System.out.println(str1 + " is equal to " + str2);
        }

        else {
            System.out.println(str2 + "is greater than " + str1);
        }
    }
}

//Write a Java program to compare two strings lexicographically, ignoring case differences.
