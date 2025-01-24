package WK2;

import java.util.Scanner;

public class Greatest_value {
    public static void main(String [] args){
        System.out.println("inPut the 1st number");
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        System.out.println("1st number:" + num1);
        int num2 = in.nextInt();
        System.out.println("2nd number:" + num2);
        int num3 = in.nextInt();
        System.out.println("3rd number:" + num3);

        if(num1 > num2 && num1 > num3){
            System.out.println("The greatest is " + num1);

        }

        else if (num2 > num1 && num2 > num3){
            System.out.println("The greatest is " + num2);
        }

        else {
            System.out.println("The greatest is " + num3);
        }
    }
}