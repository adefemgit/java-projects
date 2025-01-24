package WK1;

public class SearchingForChars {
    public static void main(String [] args){
        String statement = "This is the Mississippi River";
        int i = statement.indexOf('s');
        System.out.println("The first index of 's' is " + i);
        int j = statement.indexOf('s', + i + 1);
        System.out.println("The next index of 's' is " + j);
        int k = statement.indexOf('s', + j + 1);
        System.out.println("The next index of 's' is " + k);
        int m = statement.lastIndexOf('s');
        System.out.println("the last index of 's' is " + m);
        System.out.println(statement.substring(m));

    }
}
