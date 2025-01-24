package WK3;

import java.util.Scanner;

public class Average {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("please input values");

    int a = in.nextInt();
        System.out.println("a = " + a);
    int b = in.nextInt();
        System.out.println("b = " + b);
    int c = in.nextInt();
        System.out.println("c = " + c);


        int avg = Num(a,b,c);
        System.out.println("Average = " + avg);
    }

    static int Num(int x, int y, int z){
        int num = (x+y+z)/3;
        return num;
    }
}
