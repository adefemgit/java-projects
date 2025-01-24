package WK2;

import java.util.Scanner;

public class Divisible_number {
    public static void main(String [] args){

        System.out.println("please input value: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("num = " + num);


        if(num % 5 == 0 && num % 11 ==0){
            System.out.println("Divisible");

        }
        else{
            System.out.println("Not divisible");
        }
    }
}

//Write a program to check whether a number is divisible by 5 and 11 or not
