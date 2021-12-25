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
        } while (currentPlayer.getNumber() != hiddenNumber);
    }

    private int generateSecretNumber() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    private void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " введите число:");
        int playerInput = scanner.nextInt();
        currentPlayer.setNumber(playerInput);

        if (playerInput == hiddenNumber) {
            System.out.println(currentPlayer.getName() + " победил.");
        }
        System.out.println("Данное число "
                + (playerInput > hiddenNumber ? " больше" : " меньше")
                + " того, что загадал компьютер");
    }
}