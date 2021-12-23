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
        currentPlayer = playerOne;
        while (makeMove()) {
            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
        }
    }

    private int generateSecretNumber() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    private boolean makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " введите число:");
        if (compareNumbers(scanner.nextInt())) {
            System.out.print(currentPlayer.getName() + " победил.");
            return false;
        }
        return true;
    }

    private boolean compareNumbers(int guessedNumber) {
        currentPlayer.setNumber(guessedNumber);
        if (guessedNumber == hiddenNumber) {
            return true;
        }
        System.out.println("Данное число "
                + (guessedNumber > hiddenNumber ? " больше" : " меньше")
                + " того, что загадал компьютер");
        return false;
    }
}