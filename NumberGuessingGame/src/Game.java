import java.util.Random;

public class Game {
    private int attempts;
    private final int numberToGuess;

    public Game(){
        Random rand = new Random();
        this.attempts = 0;
        this.numberToGuess = rand.nextInt(100) +1;

    }

    public boolean checkGuess(int guess){
        attempts++;
        if(guess > numberToGuess){
            System.out.println("Incorrect., guess range is too high." );
            return false;
        }
        else if(guess  < numberToGuess){
            System.out.println("Incorrect. guess range is too low." );
            return false;
        }
        else{
            System.out.println("Correct.");
            return true;
        }

    }
}
