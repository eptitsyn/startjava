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
        while (true) {
            makeMove();
            if (isWon()) {
                return;
            }
            compareNumber();
            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
        }
    }

    private int generateSecretNumber() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    private void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " введите число:");
        currentPlayer.setNumber(scanner.nextInt());
    }

    private boolean isWon() {
        if (currentPlayer.getNumber() == hiddenNumber) {
            System.out.println(currentPlayer.getName() + " победил.");
            return true;
        }
        return false;
    }

    private void compareNumber() {
        System.out.println("Данное число "
                + (currentPlayer.getNumber() > hiddenNumber ? " больше" : " меньше")
                + " того, что загадал компьютер");
    }

}