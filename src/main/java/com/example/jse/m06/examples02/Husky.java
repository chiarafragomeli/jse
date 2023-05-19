package com.example.jse.m06.examples02;

public class Husky extends Dog {

    public Husky(int frequency) {
        super(frequency);
    }
    
    @Override
    public String toString() {
        return "Husky [frequency=" + getFrequency() + "]";
    }
    
    @Override
    public void bark() {
        System.out.println("I'm a husky " + getFrequency());
    }
}