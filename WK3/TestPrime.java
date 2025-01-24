package WK3;

public class TestPrime {
    public static void main(String [] args){
        for(int i = 0; i < 51; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isPrime(int n ){
        if(n < 2){
            return false;
        }
        else if (n == 2){
            return true;
        }
        else if(n % 2 == 0){
            return false;
        }
        else{
            return true;
        }

    }
}
