package WK1;

public class TestToString {
    public static void main(String [] args){
        StringBuffer buf = new StringBuffer();
        buf.append("It was the age of wisdom");
        System.out.println("buf = " + buf);
        System.out.println("buf.length() "  +  buf.length());
        System.out.println("buf.capacity " + buf.capacity());
        String str = buf.toString();
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
        buf.append(" " + str.substring(0,18)  + "foolishness");
        System.out.println("buf = " + buf);
        System.out.println("buf.length() = " + buf.length());
        System.out.println("buf.capacity() = " + buf.capacity());
        System.out.println("str = " + str);

    }
}
