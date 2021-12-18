import java.util.Scanner;


public class GuessNumberTest {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player1, player2;
        System.out.print("Имя первого игрока:");
        player1 = new Player(scanner.nextLine());
        System.out.print("Имя второго игрока:");
        player2 = new Player(scanner.nextLine());

        while (true) {
            GuessNumber game = new GuessNumber(player1, player2);

            int guessNumber;
            do {
                System.out.print(game.getCurrentPlayer().getName() + " введите число:");
                guessNumber = Integer.parseInt(scanner.nextLine());
            } while (!game.guess(guessNumber));
            System.out.print(game.getCurrentPlayer().getName() + " победил.");

            boolean continueAnswerOk = false;
                do {
                    System.out.print("Хотите продолжить игру? [yes/no]:");
                    switch (scanner.nextLine()) {
                        case "yes":
                        continueAnswerOk = true;
                            break;
                        case "no":
                            return;
                    }
            } while (!continueAnswerOk);
        }
    }
}