package WK1;

public class TestAppending {
    public static void main(String [] args){
        StringBuffer buf = new StringBuffer(10);
        buf.append("it was ");
        System.out.println("buf = " + buf);
        System.out.println("buf.length() = " + buf.length());
        System.out.println("buf.capacity() " + buf.capacity());
        buf.append("the best");
        System.out.println("buf = " + buf);
        System.out.println("buf.length = " + buf.length());
        System.out.println("buf.capacity = " + buf.capacity());
        buf.append("of times");
        System.out.println("buf = " + buf);
        System.out.println("buf.length = " + buf.length());
        System.out.println("buf.capacity = " + buf.capacity());


    }
}
