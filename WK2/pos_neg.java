package WK2;

import java.util.Scanner;

public class pos_neg {
    public static void main(String [] args){

        System.out.println("please input the value ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();


        if(value < 0){
            System.out.println(value + " Negative");
        }
        else{
            System.out.println(value + " positive");
        }
    }
}
