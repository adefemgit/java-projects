package packageMethod;

public class Rectangle {

    int length;
    int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }
    public int calculateArea(){
        return length * width;
    }

    public int calculatePerimeter(){
        return 2*(length + width);
    }

    public static void main(String [] args){

        Rectangle myRectangle = new Rectangle(4,5);

        int area = myRectangle.calculateArea();
        int perimeter = myRectangle.calculatePerimeter();

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
