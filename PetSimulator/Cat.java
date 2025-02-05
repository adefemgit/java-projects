package PetSimulator;

public class Cat extends Pet{
    public Cat(String name){
        super(name);
        this.name = name;
    }


    @Override
    public void play(){
        System.out.println("The cat is chasing a rat.");

    }

}
