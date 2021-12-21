import java.util.Scanner;

public class GuessNumberTest {

    private static boolean continueGame() {
        String continueGameAnswer;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Хотите продолжить игру? [yes/no]:");
            continueGameAnswer = scanner.nextLine();
            if (continueGameAnswer.equals("no")) {
                return false;
            } else if (continueGameAnswer.equals("yes")) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
        } while (continueGame());
    }
}