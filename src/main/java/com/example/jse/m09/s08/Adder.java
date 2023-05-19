/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m09.s08;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * File input by Scanner
 */
public class Adder {
    private static final Logger log = Logger.getGlobal();

    /**
     * Scanner
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0.0;

        Scanner scanner = new Scanner(System.in); // System.in in contrapposizione a System.out, legge dalla tastiera
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
                log.info("Current result is " + result);
            } else {
                System.out.println("Bad input, discarded: " + scanner.next());
            }
        }
        scanner.close();
        System.out.println("Total is " + result);
    }
}
