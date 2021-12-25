package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter first operand:");
        int a = 2;
        System.out.println("Enter operation:");
        char mathOperation = '^';
        System.out.println("Enter second operand:");
        int b = 3;

        double result = 0;
        if (mathOperation == '+') {
            result = a + b;
        } else if (mathOperation == '-') {
            result = a - b;
        } else if (mathOperation == '*') {
            result = a * b;
        } else if (mathOperation == '/') {
            result = a / b;
        } else if (mathOperation == '%') {
            result = a % b;
        } else if (mathOperation == '^'){
            result = 1;
            for(int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.println("Result = " + result);
    }
}