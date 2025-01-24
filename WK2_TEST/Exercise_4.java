package WK2_TEST;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int num = in.nextInt();


        int fact = 1;
        for(int i = 1; i<= num; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
