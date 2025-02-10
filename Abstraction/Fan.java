package Abstraction;

public class Fan extends ElectronicDevice {

    @Override
    void turnOn(){
        System.out.println("The fan is spinning");
    }

    void turnOff(){
        System.out.println("The fan is switched off");
    }

}
