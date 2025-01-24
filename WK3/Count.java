package WK3;

import java.util.Scanner;

public class Count {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = in.nextLine();
        System.out.println("string = " + input);

        int total = countWords(input);
        System.out.println("total words = " + total);
    }


    static int countWords (String str){
        if (str == null || str.isEmpty()){
            return 0;
        }

        String [] words = str.trim().split("\\s+");
        return words.length;
    }

}
