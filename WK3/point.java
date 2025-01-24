package WK3;

public class point {

    private double x;
    private double y;

    public point(double a, double b){
         x = a;
         y = b;
    }

    public double x(){
        return x;
    }

    public double y(){
        return y;
    }

   public boolean equals(point p){
     return (x == p.x && y == p.y);
   }

   public String toString(){
        return new String("(" + x + "," + y + ")");
   }


   public static void main(String [] args){
       point p = new point(2,3);
       System.out.println("p.x = " + p.x() + " p.y = " + p.y());
       System.out.println("p = " + p);

       point q = new point(2,3);
       System.out.println("q.x = " + q.x() + " q.y = " + q.y());
       System.out.println("p = " + q);

       point m = new point(3,4);
       System.out.println("m.x = " + m.x() + " m.y = " + m.y());
       System.out.println("p = " + m);

       if(q.equals(p)){
           System.out.println("Q equals P");
       }

       else{
           System.out.println("Q does not equal P");
       }

       if(p.equals(m)){
           System.out.println("p equals M");
       }

       else{
           System.out.println("P does not equal M");
       }

   }



}
