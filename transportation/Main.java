package transportation;

public class Main {
    public static void main(String [] args){
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();


        car.start();
        car.setSpeed(40);
        car.displaySpeed();
        car.stop();
        bicycle.start();
        bicycle.setSpeed(10);
        car.displaySpeed();
        bicycle.stop();


    }
}
