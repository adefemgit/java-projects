package WK3;

import java.util.Random;

public class TestMin {
    public static void main(String [] args){

        float x;
        float y;


        Random rand = new Random();
        x = rand.nextFloat();
        int m = Math.round(100 * x);
        y = rand.nextFloat();
        int n = Math.round(100 * y);


        int minvalue = min(m,n);

        System.out.println("min (" + m + "," + n + ")" + " = " + minvalue);


    }
    static int  min(int x, int y){
        if(x < y){
            return x;

            }
        else{
            return y;
        }
    }
}
