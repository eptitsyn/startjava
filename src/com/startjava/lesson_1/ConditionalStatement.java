package com.startjava.lesson_1;

public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("age greater than 20");
        }

        boolean isMale = false;
        if (isMale) {
            System.out.println("subject is a male");
        }

        if (!isMale) {
            System.out.println("subject is not a male");
        }

        double height = 1.72; 
        if (height < 1.80) {
            System.out.println("height greater than 1.80 m");
        } else {
            System.out.println("height is not greATER THAN 1.80 m");
        }

        char firstLetterOfName = 'B';
        if (firstLetterOfName == 'M') {
            System.out.println("subject's first letter of name is \"M\"");
        } else if (firstLetterOfName == 'I'){
            System.out.println("subject's first letter of name is \"I\"");
        } else {
            System.out.println("subject's first letter of name som letter other than M & I");
        }
    }
}