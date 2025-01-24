package WK3;

public class car {
    String make;
    String model;
    int year;
    int speed;

    void start(){

        System.out.println("The car is starting");
    }

    void accelerate(int increment){
        speed += increment;
        System.out.println("The car accelerated. Current speed: " + speed + "km/h");
    }

    void brake(int decrement){
        speed -= decrement;
        System.out.println("The car deceleration. current speed: " + speed + "km/h");
        if(speed <= 0){
            speed = 0;
        }
        System.out.println();
    }

    void displayDetails(){
        System.out.println("Car details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current Speed: " + speed + " km/h");
    }

    public static void main(String [] args){
        car car1 = new car();

        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 1997;
        car1.speed = 30;


        car1.start();
        car1.accelerate(20);
        car1.brake(10);
        car1.displayDetails();
    }
}
