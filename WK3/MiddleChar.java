package WK3;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String [] args){


    Scanner in = new Scanner(System.in);
    System.out.println("input a string: ");
    String str = in.nextLine();

        String mid = middle(str);
    System.out.println("The middle character is:  " + mid);



    }

    static String middle(String str){
        int position;
        int length;

        if(str.length() % 2 == 0){
            position = str.length() / 2-1;
            length = 2;
        }
        else {
            position= str.length() / 2;
            length = 1;
        }
    return str.substring(position, position + length);
    }
}
