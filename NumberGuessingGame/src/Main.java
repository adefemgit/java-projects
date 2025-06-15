//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Game game = new Game();
    Player player = new Player();

    Boolean HasWon;
    do{
        int guess = player.guess();
        HasWon = game.checkGuess(guess);

    }
    while (!HasWon);
    player.closeScanner();

    }
}