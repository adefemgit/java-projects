package WK2;

public class multiplication_table {
    public static void main(String [] args){


        final int SIZE = 15;

        for(int num = 1; num <= SIZE; num++ ){

            for(int i = 1; i<= SIZE; i++){
                System.out.print(num * i + "\t");
            }
            System.out.println();
        }
    }
}
