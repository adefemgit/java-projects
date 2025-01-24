package packageMethod;

public class Multiplication {

    static int Multiply(int a, int b) {

        int value;
        value = a * b;
        return value;
    }


    public static void main(String [] args){

        int result = Multiply(2,3);
        System.out.println("The value is = " + result);
    }
}
