package com.startjava.lesson_2_3_4.game;

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
    }

    public void start() {
        hiddenNumber = generateSecretNumber();
        playerOne.clearNumbers();
        playerTwo.clearNumbers();
        System.out.println("У каждого игрока " + playerOne.getMaxGuessTries() + " попыток");
        do {
            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
        } while (makeMove());
        System.out.println("Названные числа:");
        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
    }

    private int generateSecretNumber() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    private boolean makeMove() {
        Scanner scanner = new Scanner(System.in);
        if (!currentPlayer.hasTries()) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            return isAnyPlayerHaveTries();
        }
        System.out.print(currentPlayer.getName() + " введите число:");
        currentPlayer.setNumber(scanner.nextInt());

        if (currentPlayer.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + currentPlayer.getName() + " угадал число с " + currentPlayer.getTryCount() + " попытки");
            return false;
        }
        System.out.println("Данное число "
                + (currentPlayer.getNumber() > hiddenNumber ? " больше" : " меньше")
                + " того, что загадал компьютер");
        return true;
    }

    private void printPlayerNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private boolean isAnyPlayerHaveTries() {
        return playerOne.hasTries() || playerTwo.hasTries();
    }
}