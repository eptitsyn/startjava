package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        do {
            System.out.println("Введите математическое выражение: ");
            System.out.println("Результат " + calculator.calculate(scanner.nextLine()));
        } while (isNext());
    }

    private static boolean isNext() {
        String continueGameAnswer = "";
        while (!continueGameAnswer.equals("no")) {
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            continueGameAnswer = scanner.nextLine();
            if (continueGameAnswer.equals("yes")) {
                return true;
            }
        }
        return false;
    }
}