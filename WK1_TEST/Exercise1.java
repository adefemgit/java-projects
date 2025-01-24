package WK1_TEST;

public class Exercise1 {
    public static void main(String [] args){
        String str = "pompeii is elite";

        System.out.println(str.toUpperCase());
        System.out.println(str.replace(" ", "_"));


        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "frimpong" );
        System.out.println(letter);
    }
}
