package WK2;

import java.util.Scanner;

public class weekday {
    public static void main(String [] args){

        System.out.println("Please input the number from 1 -7 ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        String dayName = " ";
        switch(day){
            case 1: dayName = "Sunday";
            break;
            case 2: dayName = "Monday";
            break;
            case 3: dayName = "Tuesday";
            break;
            case 4: dayName = "Wednesday";
            break;
            case 5: dayName = "Thursday";
            break;
            case 6: dayName = "Friday";
            break;
            case 7: dayName = "Saturday";
            break;
            default: dayName = "Invalid range type";
            break;
        }

        System.out.println(dayName);

    }
}

