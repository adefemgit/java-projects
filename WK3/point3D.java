package WK3;

public class point3D {
    private double x;
    private double y;
    private double z;

    public point3D(){
        setX(0.0);
        setY(0.0);
        setZ(0.0);
    }
    public point3D(double a, double b, double c){
        setX(a);
        setY(b);
        setZ(c);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }

    public String toString(){
        return new String("(" + x + "," + y + "," + z +")");
    }

    public boolean equals(point3D p){
        return (getX() == p.x && getY() == p.y && getZ() == p.z);

    }

    public double distanceFromOrigin(){
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }

    public static void main(String [] args){
        point3D p1 = new point3D();
        System.out.println("point1 = " + p1);

        point3D p2 = new point3D(2,3,4);
        System.out.println("point2 = " + p2);

        point3D p3 = new point3D(4,5,6);
        System.out.println("point3 = " + p3);

        if (p1.equals(p2)){
            System.out.println("p1 equals p2");
        }

        else{
            System.out.println("p1 doesnt equal p2");
        }

        double distance = p1.distanceFromOrigin();
        System.out.println("Distance from origin for point1 = " + distance);
        double distance1 = p2.distanceFromOrigin();
        System.out.println("Distance from origin for point2 = " + distance1);


    }

}
