package packageMethod;

public class Calculator {


    static int add1(int a, int b){
        return a + b;
    }

    static int add2(int a, int b, int c){
        return a + b + c;
    }


    public static void main(String [] args){


        int result1 = Calculator.add1(2,3);
        int result2 = Calculator.add2(4,3,4);

        System.out.println("The added value is = " + result1);
        System.out.println("The added value is = " + result2);

    }
}
