package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    public int MAX_GUESS_TRIES = 10;
    private String name;
    private int[] numbers = new int[MAX_GUESS_TRIES];
    private int tryCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        if (tryCount > 0) {
            return numbers[tryCount - 1];
        }
        return -1;
    }

    public void setNumber(int number) {
        if (tryCount < MAX_GUESS_TRIES) {
            numbers[tryCount] = number;
            tryCount++;
        } else {
            System.out.println("У " + name + " закончились попытки");
        }
    }

    public int getMAX_GUESS_TRIES() {
        return MAX_GUESS_TRIES;
    }

    public int getTryCount() {
        return tryCount;
    }

    public boolean hasTries() {
        return tryCount < MAX_GUESS_TRIES;
    }

    public void printNumbers() {
        System.out.println(Arrays.toString(Arrays.copyOf(numbers, tryCount)));
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, tryCount, 0);
        tryCount = 0;
    }
}