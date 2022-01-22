package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        do {
            System.out.println("Введите математическое выражение: ");
            System.out.println("Результат " + calculator.calculate(scanner.nextLine()));
        } while (userAnswer());
    }

    private static boolean userAnswer() {

        while (true) {
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            String continueCalculations = scanner.nextLine();
            if (continueCalculations.equals("no")) {
                return false;
            }
            if (continueCalculations.equals("yes")) {
                return true;
            }
        }
    }
}