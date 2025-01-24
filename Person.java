public class Person {

    String firstName;
    String lastName;
    int age;

    void eat(String food){
       System.out.println("I am eating my food with " + food);
    }
    void describeEyes(String colour){
        System.out.println("my eyes are " + colour);
    }
    void describeComplexion(String colour){
        System.out.println("My complexion is " + colour);
    }

    @Override
    public String toString(){
        return "person [firstname =" + firstName + ",lastName = " + lastName + ", age = " + age + "]";
    }



    public static void main(String [] args){
        Person person = new Person();
        person.firstName = "Alfredo";
        person.lastName = "john";
        person.age = 22;

        person.eat("salad");
        person.describeEyes("brown");
        person.describeComplexion("white");

        System.out.println(person);



    }
}

