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
        hiddenNumber = generateSecretNumber();
    }

    public void start() {
        currentPlayer = playerTwo;
        do {
            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
            makeMove();
        } while (!hasWon());
    }

    private int generateSecretNumber() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    private boolean hasWon() {
        if (currentPlayer.getNumber() == hiddenNumber) {
            System.out.println(currentPlayer.getName() + " победил.");
            return true;
        }
        System.out.println("Данное число "
                + (currentPlayer.getNumber() > hiddenNumber ? " больше" : " меньше")
                + " того, что загадал компьютер");
        return false;
    }

    private void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " введите число:");
        currentPlayer.setNumber(scanner.nextInt());
    }
}