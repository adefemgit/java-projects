package WK2_TEST;

import java.util.Scanner;

public class Reverse {
    public static void main(String [] args){

        int num;
        int reverse = 0;
        int remainder ;


        Scanner in = new Scanner(System.in);
        System.out.println("please input numbers ");
        num = in.nextInt();
        System.out.println(num);

        while(num > 0){
            remainder = num % 10;
            num = num / 10;
            reverse = (reverse * 10 ) + remainder;

        }
        System.out.println(reverse);
    }
}
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
// For example, if the input is 12345, the output should be 54321.
