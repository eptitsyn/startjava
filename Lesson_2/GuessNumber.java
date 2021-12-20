import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int hiddenNumber;
    private boolean gameIsOn;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        currentPlayer = playerOne;
    }

    public void start() {
        generateSecretNumber();
        currentPlayer = playerOne;
        gameIsOn = true;
        while (gameIsOn) {
            makeMove();
        }
    }

    private void generateSecretNumber() {
        Random r = new Random();
        int min = 1;
        int max = 100;
        hiddenNumber = r.nextInt(max - min) + min;
    }

    private void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " введите число:");
        if (compareNumbers(Integer.parseInt(scanner.nextLine()))) {
            System.out.print(currentPlayer.getName() + " победил.");
            gameIsOn = false;
        } else {
            nextPlayer();
        }
    }

    private boolean compareNumbers(int guessedNumber) {
        currentPlayer.setNumber(guessedNumber);
        if (guessedNumber == hiddenNumber) {
            return true;
        } else if (guessedNumber > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }

    private void nextPlayer() {
        if (currentPlayer == playerOne) {
            currentPlayer = playerTwo;
        } else {
            currentPlayer = playerOne;
        }
    }
}