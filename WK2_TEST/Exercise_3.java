package WK2_TEST;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String [] args){


        Scanner in = new Scanner(System.in);
        System.out.println("please a number: ");
        int num = in.nextInt();

        for(int i = 1; i<=12; i++){
            System.out.println(num*i);
        }
    }
}
