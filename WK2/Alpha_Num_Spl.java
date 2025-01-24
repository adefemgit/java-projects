package WK2;

import java.util.Scanner;

public class Alpha_Num_Spl {
    public static void main(String [] args){
        System.out.println("please insert phrase");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ){
            System.out.println("alphabet");
        }

        else if(ch >= '0' && ch <= '9'){
            System.out.println("Digits");
        }

        else{
            System.out.println("Special Character");
        }

    }
}
