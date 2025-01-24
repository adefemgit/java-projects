package WK2;

import java.util.Scanner;

public class upper_lower {
    public static void main(String [] args){
        System.out.println("please input the character ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("invalid character");
        }
    }
}
