package WK2;

import java.util.Scanner;

public class Negative_positive {
    public static void main(String [] args){

        System.out.println("please insert value that needs to be checked");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("num = " + num);


        if (num < 0 ){
            System.out.println("Negative number!");
        }
        else if(num == 0){
            System.out.println("zero !");

        }
        else{
            System.out.println("number is positive");
        }
    }
}
//Write a program to check whether a number is negative, positive or zero
