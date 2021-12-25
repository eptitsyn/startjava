package com.startjava.lesson_2_3.robot;

import java.util.Scanner;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Crimson Red");
        jaeger1.setHeight(120f);
        jaeger1.setSpeed(100);

        System.out.println(jaeger1.getInfo());
        jaeger1.setHeight(130f);
        System.out.println(jaeger1.getInfo());

        Jaeger jaeger2 = new Jaeger("Gypsy Avenger", 268f, 120);
        System.out.println(jaeger2.getInfo());
        jaeger2.setHeight(230f);
        System.out.println(jaeger2.getInfo());
    }
}