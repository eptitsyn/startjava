package com.startjava.lesson_2_3.game;

public class Person {

    String name = "John";
    char sex = 'M';
    float height = 170;
    float weight = 62;
    int age = 25;

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void sit() {
        System.out.println(name + " is sitting.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void speak() {
        System.out.println("Hi, Im " + name);
    }

    public void learnJava() {
        System.out.println(name + " is walking.");
    }
}