package PetSimulator;

public class Main {
    public static void main(String [] args){
        Pet dog = new Dog("jasper");
        Pet cat = new Cat("kuku");
        Pet bird = new Bird("pedro");



        dog.getStatus();
        dog.setHunger(30);
        dog.getStatus();


        cat.getStatus();
        dog.feed();
        dog.play();
        dog.getStatus();


        dog.setHunger(60);
        dog.getStatus();

        dog.setHunger(30);  //
        dog.getStatus();

        bird.sleep();
        bird.play();
    }
}
