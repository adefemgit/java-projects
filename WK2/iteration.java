package WK2;

import java.util.Random;

public class iteration {
    public static void main(String [] args){
        Random random = new Random();
        float x = random.nextFloat();
        int n = Math.round(21 * x);

        int f = 1;
        int k = 1;

        do f *= k++;
        while (k <= n);

        System.out.println(n + "! = " + f );
    }
}
