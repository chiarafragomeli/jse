/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s08.exercise;

/**
 * Complete the code
 * 
 * @see Main the user class
 */
public class Square {
    // every square should have its own side length
    double side;

    /**
     * Constructor
     * 
     * @param side the square side
     */
    public Square(double side) {
        // initialize the current side length
        this.side = side;
    }

    /**
     * The square area is side ^ 2
     * 
     * @return the square area
     */
    public double area() {
        return Math.pow(side, 2);
    }

    /**
     * The square perimeter is 4 * side
     * 
     * @return the square perimeter
     */
    public double perimeter() {
        return side * 4;
    }
}
