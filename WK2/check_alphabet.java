package WK2;

import java.util.Scanner;

public class check_alphabet {
    public static void main(String [] args){
        System.out.println("input please: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);


        if(ch >= 'a' && ch <='z' || ch>= 'A' && ch<= 'Z'){
            System.out.println("character is alphabet");
        }

        else{
            System.out.println("Character is not alphabet");
        }
    }
}
