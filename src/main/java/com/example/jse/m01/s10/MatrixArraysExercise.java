/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s10;

import java.util.Arrays;

/**
 * Exercise on two-dimensional array
 */
public class MatrixArraysExercise {
    /**
     * <ol>
     * <li>Create a two line matrix
     * <ul>
     * <li>Row 1: "ciao", "buongiorno"
     * <li>Row 2: "hello", "good morning"
     * </ul>
     * <li>Print the first English greeting
     * <li>Convert the Italian greetings in a string and print it
     * <li>Convert the full matrix in a string and print it
     * 
     * @param args not used
     */
    public static void main(String[] args) {
     //creazione della matrice
        String[][] greetings = {//
                {"ciao", "buongiorno"},//
                {"hello", "good morning"}//
        };
     //  String[][] greetings = {{"ciao", "buongiorno"},{"hello", "good morning"}};
     //stampa   
        System.out.println("The first English greeting is \"" + greetings[1][0] + "\".");
        System.out.println("The Italian greetings are " + Arrays.toString(greetings[0]) + ".");
        System.out.println("The length of my array is " + greetings.length);
        System.out.println("My array is " + Arrays.deepToString(greetings));
        System.out.println("Done");
    }
}
