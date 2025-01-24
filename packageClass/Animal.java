package packageClass;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age){

        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void speak(){
        System.out.println("My name is " + name + " and i am " + age + " years old");
    }
    public static void main(String [] args){

        Animal myAnimal = new Animal("Dog", 5);
        Animal cat = new Animal("cat", 3);
        Animal bird = new Animal("Bird", 2);                                                                                                                                                                                                                                                                          new Animal("Bird", 2);
        myAnimal.speak();
        cat.speak();
        bird.speak();

        bird.setName("Parrot");
        bird.setAge(3);

        bird.speak();
    }

}
