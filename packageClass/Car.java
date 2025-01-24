package packageClass;

public class Car {

    String color;
    int door;
    int horsePower;
    String brand;

    public void showDetails(){
        System.out.println("Brand of car: " + brand );
        System.out.println("color of car: " + color);
        System.out.println("Door number: " + door);
        System.out.println("Horse power: " + horsePower);

    }


    public static void main(String [] args){
        Car myCar = new Car();

        myCar.brand = "Volkswagen";
        myCar.color = "Blue";
        myCar.door = 4;
        myCar.horsePower = 50;

        myCar.showDetails();
    }
}
