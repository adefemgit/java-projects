package WK2_TEST;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please input number: " );
        int base= in.nextInt();
        System.out.println("please input power number: " );
        int power = in.nextInt();
        int result = 1;


        for(int i = 1; i <= power; i++ )
        {
          result *= base;
        }

    System.out.println(result);
    }
}

//Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another.//
// (Do not use Java built-in method)
