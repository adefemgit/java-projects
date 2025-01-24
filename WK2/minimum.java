package WK2;

import java.util.Random;

public class minimum {
    public static void main(String [] args){
       Random rand = new Random();
       int m = rand.nextInt();
       System.out.println("m = " + m);
       int n = rand.nextInt();
       System.out.println("n = " + n);

       if(m < n){
           System.out.println("The minimum is " + m );
       }

       else {
           System.out.println("the minimum is " + n);
       }
    }
}//TestingTwoRandomIntegersforTheirMinimum
