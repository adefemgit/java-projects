package WK3;

public class calculator {

    private int num1;
    private int num2;

    public calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        return this.num1 + this.num2;
    }

    public int multiply(){
        return this.num1 * this.num2;
    }

    public static void main (String [] args){
        calculator calc = new calculator(2,3);

        int sum = calc.add();
        System.out.println("sum = " + sum);

        int product = calc.multiply();
        System.out.println("product = " + product);
    }

}
