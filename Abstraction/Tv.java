package Abstraction;

public class Tv extends ElectronicDevice {

    @Override
    void turnOn(){
        System.out.println("The tv is switched on, 12 channels, are available");

    }
    @Override
    void turnOff(){
        System.out.println("The tv is switched off");
    }

}
