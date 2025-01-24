package WK1;

public class BufReplacing {
    public static void main(String [] args){
        StringBuffer buf = new StringBuffer();
        buf.append("It was the best of times");
        System.out.println("buf = " + buf);
        System.out.println("buf.length() = " + buf.length());
        System.out.println("buf.capacity() = " + buf.capacity());
        buf.setCharAt(12, 'o');
        System.out.println("buf = " + buf);
        buf.setCharAt(11,'w');
        System.out.println("buf = " + buf);
        buf.insert(13, 'r');
        System.out.println("buf = " + buf);




    }
}
