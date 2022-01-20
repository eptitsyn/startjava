package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    private static boolean isNext() {
        Scanner scanner = new Scanner(System.in);
        String continueGameAnswer = "";
        while (!continueGameAnswer.equals("no")) {
            System.out.print("Хотите продолжить игру? [yes/no]:");
            continueGameAnswer = scanner.nextLine();
            if (continueGameAnswer.equals("yes")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);

        do {
            game.start();
        } while (isNext());
    }
}