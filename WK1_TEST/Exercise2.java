package WK1_TEST;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String [] args){

        System.out.println("Enter 10-digit telephone number: ");
        Scanner in = new Scanner(System.in);
        String dial = in.nextLine();
        System.out.println("You entered " + dial);
        String areacode = dial.substring(0,3);
        System.out.println("The area code is " + areacode);
        String exchange = dial.substring(3,6);
        System.out.println("The exchage is " + exchange);
        String number = dial.substring(6);
        System.out.println("The number is " + number);
        System.out.println("The complete telephone number is (" + areacode +")" + exchange + "-" + number);




    }
}
