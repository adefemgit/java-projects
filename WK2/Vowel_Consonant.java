package WK2;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String [] args){
        System.out.println("please input an alphabet");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch== 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
