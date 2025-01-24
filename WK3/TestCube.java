package WK3;

public class TestCube {
    public static void main(String [] args){

        for(int i =0; i< 6; i++){
            System.out.println(i + "\t" + cube(i));
        }

    }
    static int cube(int n)
    {
        return  n*n*n;

    }
}
