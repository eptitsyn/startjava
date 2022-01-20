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
            System.out.print("Enter first operand:");
            calculator.setOperandOne(scanner.nextInt());
            scanner.nextLine();//consume crlf
            System.out.print("Enter operation:");
            calculator.setMathOperation(scanner.nextLine().charAt(0));
            System.out.print("Enter second operand:");
            calculator.setOperandTwo(scanner.nextInt());
            System.out.println("Результат " + calculator.calculate());
        } while (userAnswer());
    }
}