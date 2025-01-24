package WK3;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String [] args){

        int a;
        int b;
        int c;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("a = " + a);
        b= in.nextInt();
        System.out.println("b = " + b);
        c= in.nextInt();
        System.out.println("c = " + c);

        int smallest = min(a,b,c);
        System.out.println("smallest value = " + smallest);
    }


    static int min(int x,int y, int z){
        if(x < y && x < z){
            return x;

        }
        else if(y < x && y < z){
            return y;
        }
        else{
            return z;
        }
    }
}
