package WK2;

import java.util.Scanner;

public class decimal_points {
    public static void main(String [] args){

        System.out.println("please input your values");
        Scanner in = new Scanner(System.in);
        Double x = in.nextDouble();
        System.out.println("x = " + x);
        Double y = in.nextDouble();
        System.out.println("y = " + y);


        x = (double) Math.round(x * 1000);
        x = x/1000;

        y = (double) Math.round(y * 1000);
        y = y/1000;


        if(x == y){
            System.out.println("They are the same up to three decimal places");
        }

        else{
            System.out.println("They are different");
        }

    }
}
