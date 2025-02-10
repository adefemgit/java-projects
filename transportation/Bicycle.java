package transportation;

public class Bicycle extends Vehicle {


    @Override
    void start(){
        System.out.println("Start pedalling, to move forward");
    }

    void stop(){

            System.out.println("bicycle stops by activating the break...");
    }
}
