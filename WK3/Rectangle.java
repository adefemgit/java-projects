package WK3;

public class Rectangle {

    double length;
    double width;

   public Rectangle(double length, double width){
        this.length = length;
        this.width = width;


    }

    public double getArea(){
       return length * width;
    }

    public double getPerimeter(){
       return 2 * (length * width);
   }

   public boolean isSquare(){
       return length == width;
   }

   public static void main(String [] args){
        Rectangle rectangle = new Rectangle(4.0, 3.0);

        double area = rectangle.getArea();
        System.out.println("Area = " + area);

        double perimeter = rectangle.getPerimeter();
        System.out.println("Perimeter = " + perimeter);

        boolean result1 = rectangle.isSquare();
        System.out.println("is rectangle a square? " + result1);

   }


}
