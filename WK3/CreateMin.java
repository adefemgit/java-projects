package WK3;

public class CreateMin {

    static int findMin(int [] Numbers){

        int min = Numbers[0];
        for(int i = 1; i < Numbers.length; i++){
            if(Numbers[i] <  min){
                min = Numbers[i];
            }
        }
        return min;
    }
    public static void main(String [] args){

        int [] MyArray = {2,3,46,78,9,0};
        int Smin = findMin(MyArray);
        System.out.println("The smallest value is  " + Smin);
    }
}
