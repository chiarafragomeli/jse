package com.example.jse.m06.examples02;

public class Shiba extends Dog {

    public Shiba(int frequency) {
        super(frequency);
    }

    @Override
    public String toString() {
        return "Shiba [frequency=" + getFrequency() + "]";
    }

    @Override
    public void bark() {
        System.out.println("I'm a shiba " + getFrequency());
    }

}
