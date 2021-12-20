import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int randomNumber;
    private boolean gameIsOn;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        currentPlayer = playerOne;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void startNewGame() {
        setNewRandomNumber();
        currentPlayer = playerOne;
        gameIsOn = true;
    }

    public void setNewRandomNumber() {
        Random r = new Random();
        int min = 1;
        int max = 100;
        randomNumber = r.nextInt(max - min) + min;
    }

    public boolean getGameIsOn() {
        return gameIsOn;
    }

    public void doTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getCurrentPlayer().getName() + " введите число:");
        if (guessAndCheckIfWon(Integer.parseInt(scanner.nextLine()))) {
            System.out.print(getCurrentPlayer().getName() + " победил.");
            gameIsOn = false;
        } else {
            nextPlayer();
        }
    }

    public boolean guessAndCheckIfWon(int guessedNumber) {
        currentPlayer.setNumber(guessedNumber);
        if (guessedNumber == randomNumber) {
            return true;
        } else if (guessedNumber > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
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