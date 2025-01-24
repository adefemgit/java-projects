package WK1_TEST;

public class Exercise8 {
    public static void main(String [] args){
        String str1 = "This is exercise 1";
        String str2 = "This is exercise 2";

        int cmpresult = str1.compareTo(str2);

        if(cmpresult > 0 ){
            System.out.println(str1 + "is greater than " + str2);
        }

        else if(cmpresult == 0){
            System.out.println(str1 + "is equal to " + str2);
        }

        else {
            System.out.println(str2 + "is greater than " + str1);
        }




    }
}
