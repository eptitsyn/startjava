package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    private static boolean userAnswer() {
        Scanner scanner = new Scanner(System.in);
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

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите математическое выражение: ");
            String[] input  = scanner.nextLine().split(" ");
            if (input.length != 3) {
                System.out.println("Неправильное количество введенных параметров");
            }
            calculator.setOperandOne(Integer.parseInt(input[0]));
            calculator.setMathOperation(input[1].charAt(0));
            calculator.setOperandTwo(Integer.parseInt(input[2]));
            System.out.println("Результат " + calculator.calculate());
        } while (userAnswer());
    }
}