package WK2_TEST;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int num;
        int remainder;
        int reverse = 0;


        System.out.println("please insert num: ");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();

        while (num > 0){

            remainder = num % 10;
            num = num /10;
            reverse = (reverse * 10) +remainder;
        }

System.out.println(reverse);

    }
}
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
// For example, if the input is 12345, the output should be 54321.