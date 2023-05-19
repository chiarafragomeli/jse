/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

/**
 * Base of a class hierarchy
 * <P>
 */
public class Vehicle {

    @Override
    public String toString() {
        return "Vehicle []";
    }

    public void steer(Direction dir) {
        if (dir == Direction.LEFT || dir == Direction.RIGHT) {
            System.out.print("is steering to the " + dir + "\n");
        } else {
            System.out.println("I can't steer!");
        }
    }

    public void brake(String brake) {
        if (brake.equals("brake")) {
            System.out.println("Brake!");
        } else {
            System.out.println("I can't brake!");
        }
    }
}
