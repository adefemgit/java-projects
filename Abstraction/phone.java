package Abstraction;

public class phone extends ElectronicDevice {
    @Override

    void turnOn(){
       System.out.println("hello, welcome back!");
    }

    @Override
    void turnOff(){
        System.out.println("goodbye");
    }

}
