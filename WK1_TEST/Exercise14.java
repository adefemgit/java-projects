package WK1_TEST;

public class Exercise14 {
    public static void main(String [] args){
        String str1 = "python Exercises";
        String str2 = "python exercise";

        String end_str = "se";

        boolean value_one = str1.endsWith(end_str);
        boolean value_two = str2.endsWith(end_str);

        System.out.println(str1 + " ends with " +" " + end_str + " " + value_one );
        System.out.println(str2 + " ends with " +" " + end_str + " " + value_two );


    }
}
