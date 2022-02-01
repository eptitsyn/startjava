package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private int maxGuessTries = 10;
    private String name;
    private int[] numbers = new int[maxGuessTries];
    private int tryCount;

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tryCount);
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
        if (tryCount < maxGuessTries) {
            numbers[tryCount] = number;
            tryCount++;
        }
    }

    public int getMaxGuessTries() {
        return maxGuessTries;
    }

    public int getTryCount() {
        return tryCount;
    }

    public boolean hasTries() {
        return tryCount < maxGuessTries;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, tryCount, 0);
        tryCount = 0;
    }
}