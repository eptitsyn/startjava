package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private float height;
    private int speed;

    public Jaeger() {
        this("no modelname", 1f, 1);
    }

    public Jaeger(String modelName, float height, int speed) {
        this.modelName = modelName;
        this.height = height;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(int speed) {
        setSpeed(speed);
        System.out.println("running with speed " + speed);
    }

    public String getInfo() {
        return "Jaeger " + getModelName() + " height " + getHeight() + " current speed " + getSpeed();
    }
}