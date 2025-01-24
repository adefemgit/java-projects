package WK3;

public class TestEvens {

    static int evens(int [] Numbers){

        int count = 0;
        for(int i = 0; i < Numbers.length; i++){
            if (Numbers[i] % 2 == 0 ){
                count ++;
            }
        }
        return count;
    }

    public static void main(String [] args){

        int [] myArrays = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        int EvenNUm = evens(myArrays);

        System.out.println(" the number of even numbers is:   " + EvenNUm);
    }
}
