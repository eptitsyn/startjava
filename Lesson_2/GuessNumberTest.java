import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());

        String continueGameAnswer = "yes";
        while (continueGameAnswer.equals("yes")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.startNewGame();

            while (game.getGameIsOn()) {
                game.doTurn();
            }

            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                continueGameAnswer = scanner.nextLine();
                if (continueGameAnswer.equals("no")) {
                    return;
                }
            } while (!continueGameAnswer.equals("yes"));
        }
    }
}