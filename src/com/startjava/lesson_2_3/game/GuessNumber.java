package com.startjava.lesson_2_3.game;

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
        do {
            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
        } while (makeMove());
    }

    private int generateSecretNumber() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    private boolean makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " введите число:");
        currentPlayer.setNumber(scanner.nextInt());

        if (currentPlayer.getNumber() == hiddenNumber) {
            System.out.println(currentPlayer.getName() + " победил.");
            return false;
        }
        System.out.println("Данное число "
                + (currentPlayer.getNumber() > hiddenNumber ? " больше" : " меньше")
                + " того, что загадал компьютер");
        return true;
    }
}