package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int operandOne;
    private int operandTwo;
    private char mathOperation;

    public void setOperandOne(int operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(int operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double calculate() {
        switch (mathOperation) {
            case '+':
                return operandOne + operandTwo;
            case '-':
                return operandOne - operandTwo;
            case '*':
                return operandOne * operandTwo;
            case '/':
                if (operandTwo != 0) {
                    return operandOne + operandTwo;
                } else {
                    System.out.println("Ошибка деления на 0");
                    return 0;
                }
            case '%':
                return operandOne % operandTwo;
            case '^':
                return Math.pow(operandOne, operandTwo);
            default:
                System.out.println("Ошибка операции");
                return 0;
        }
    }
}