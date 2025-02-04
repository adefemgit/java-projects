package inheritance;

public class Main {
    public static void main(String [] args){

        Mouse1 m1 = new Mouse1();
        m1.setColor("Blue");
        m1.leftClick();



        Mouse2 m2 = new Mouse2();
        m2.setTexture("Glossy");
        m2.rightClick();


        Mouse3 m3 = new Mouse3();
        m3.connect();



    }
}
