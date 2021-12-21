import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int hiddenNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        currentPlayer = playerOne;
        hiddenNumber = generateSecretNumber();
    }

    public void start() {
        generateSecretNumber();
        currentPlayer = playerOne;
        while (makeMove()) {};
    }

    private int generateSecretNumber() {
        Random r = new Random();
        int min = 1;
        int max = 100;
        return r.nextInt(max - min) + min;
    }

    private boolean makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " введите число:");
        if (compareNumbers(scanner.nextInt())) {
            System.out.print(currentPlayer.getName() + " победил.");
            return false;
        } else {
            nextPlayer();
            return true;
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
        currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
    }
}