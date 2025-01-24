package packageMethod;

public class Greetings {

    static void introduce(String name, int age){
        System.out.println("Hi, my name is" + " " + name + " and i am"+ " " + age  + " years old");
    }


    public static void main(String [] args){
        introduce("Randolph", 25);
        introduce("Coco", 72);
    }
}
