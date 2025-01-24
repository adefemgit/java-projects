package WK2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args){
        System.out.println("please insert value: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println("num = " + value );


        if(value % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
