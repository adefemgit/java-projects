package Abstraction;

public class Main {
    public static void main(String [] args){
        ElectronicDevice Fan = new Fan();
        ElectronicDevice Phone  = new phone();
        ElectronicDevice tv = new Tv();

        Fan.turnOn();
        Phone.turnOn();
        tv.turnOn();
        tv.turnOff();

    }
}
