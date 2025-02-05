package PetSimulator;

public class Bird extends Pet{
    public Bird(String name){
        super(name);
        this.name = name;

    }

    @Override
    public void play(){
        System.out.println("the bird is flying with his pairs, and singing");
    }
}
