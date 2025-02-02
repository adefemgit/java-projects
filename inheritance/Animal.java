package inheritance;

public class Animal {

    void move() {
        System.out.println("Animals can move");
    }

    class Bird extends Animal {
        @Override
        void move() {
            System.out.println("Birds can fly");
        }
    }

    class Fish extends Animal {
        @Override
        void move() {
            System.out.println("Fish can swim");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();


        Bird bird = animal.new Bird();
        Fish fish = animal.new Fish();

        bird.move();
        fish.move();
    }
}


