/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s09;
/**
 * A very simple exercise in three steps on array
 */
public class Exercise {
    /**
     * <li>(1) create an array with "one", "two", "three", "four" in it
     * <li>(2) print the number of its elements
     * <li>(3) print the last element
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four"};
        System.out.println("My array has " + words.length + " elements.");

        // String[] words = new String[4];
        // words[0] = "one"; ... e così via
        
        System.out.println("The last element is \"" +  words[words.length-1]  + "\".");
     
        System.out.println("Done");
    }
}
