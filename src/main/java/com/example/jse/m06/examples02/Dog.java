package com.example.jse.m06.examples02;

public class Dog {

    public static final int LOWEST_FREQUENCY = 50;
    public static final int DEFAULT_FREQUENCY = 100;
    public static final int HIGHEST_FREQUENCY = 200;
    
    private int frequency;
    
    public Dog() {

    }

    public Dog(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public static int getLowestFrequency() {
        return LOWEST_FREQUENCY;
    }

    public static int getDefaultFrequency() {
        return DEFAULT_FREQUENCY;
    }

    public static int getHighestFreueuncy() {
        return HIGHEST_FREQUENCY;
    }

    @Override
    public String toString() {
        return "Dog [frequency=" + frequency + "]";
    }

    public void bark() {
        System.out.println("I'm a dog " + frequency);
    }
}
