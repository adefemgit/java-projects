package PetSimulator;

public class Pet {
    String name;
    int hunger = 50;
    int happiness = 50;
    int energy = 50;


    public Pet(String name){
        this.name = name;

    }

    public void feed(){
        hunger -= 20;
        if(hunger < 0){
            hunger = 0;
            System.out.println("pet fed, hunger level! " + hunger);
        }
    }

    public void play(){
        happiness += 20;

        if(happiness > 100) happiness = 100;{
            System.out.println("pet is playing, happiness level: " + happiness);
        }

        energy -= 10;
        if(energy < 0 ){
            energy = 0;
            System.out.println("Energy level: " + energy);
        }
    }

    public void sleep() {
        energy += 30;

        if (energy > 100) {
            energy = 100;
            System.out.println("After sleep energy level: " + energy);
        }

        hunger += 15;

        if(hunger > 100){
            hunger = 100;
            System.out.println("pet is doing good  " + " Hunger level: " + hunger);
        }
    }



    public void setHunger(int hunger) {
        this.hunger = hunger;
        if (this.hunger < 0)
            this.hunger = 0;
        System.out.println(name + "'s hunger is now: " + this.hunger);
    }


    public void getStatus(){
        System.out.println("PET STATUS::.");
        System.out.println("Name " + name);
        System.out.println("Hunger level " + hunger);
        System.out.println("Happiness level " + happiness);
        System.out.println("Energy level " + hunger);

    }


}
