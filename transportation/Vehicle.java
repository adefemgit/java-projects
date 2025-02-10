package transportation;

public abstract class Vehicle {

    int speed;


    public void  setSpeed(int speed){
        this.speed = speed;
    }

    abstract void start();
    abstract void stop();

    public void displaySpeed(){
        System.out.println("Current speed is " + speed + "km/hr");

    }
}
