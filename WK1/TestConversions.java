package WK1;

public class TestConversions {
    public static void main(String [] args){
        String today = "MAY 18, 1998";
        String today_date = today.substring(4,6);
        int todays_day = Integer.parseInt(today_date);
        int next_week = todays_day + 7;






        System.out.println("Today's date is " + today);
        System.out.println("Today's day is " + today_date);
        System.out.println("Next week's day is " + next_week);
        System.out.println("Next week's date is " + today.substring(0,3) + ", " + next_week + ", " + today.substring(8,12));

    }
}
