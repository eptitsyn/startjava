import java.util.Random;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int randomNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        currentPlayer = playerOne;
        startNewGame();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void startNewGame() {
        setNewRandomNumber();
        currentPlayer = playerOne;
    }

    public void setNewRandomNumber() {
        Random r = new Random();
        int min = 1;
        int max = 100;
        randomNumber = r.nextInt(max-min) + min;
    }

    public boolean guess(int guess) {
        currentPlayer.setNumber(guess);
        if (guess == randomNumber) {
            return true;
        } else if (guess > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        nextPlayer();
        return false;
    }

    public void nextPlayer() {
        if (currentPlayer == playerOne) {
            currentPlayer = playerTwo;
        } else {
            currentPlayer = playerOne;
        }
    }
}