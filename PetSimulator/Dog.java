package PetSimulator;

public class Dog extends Pet{

    public Dog(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void play(){
        System.out.println("The dog fetches a ball!");
    }

    public void feed(){
        System.out.println("The dog eats");
    }
}
