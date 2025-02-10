package transportation;

public class Car extends Vehicle{

    @Override
    void start(){
        System.out.println("Machine running... 5 minutes before you can start your journey");

    }
    void stop(){
        System.out.println("machine stopped, do not forget to switch the handbrake");
    }
}
