import java.util.Scanner;

public class Player {
    private final Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);

    }

    public int guess(){
        System.out.println("Enter number: ");
        return scanner.nextInt();
    }

    public void closeScanner(){
        scanner.close();

    }
}
