/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise4 {
    /**
     * Using while or do-while, print the first elements in args, but not more than
     * three of them.
     * <p>
     * For example:
     * <li>["ciao", "hello"] -> "ciao" "hello"
     * <li>["ciao", "hello", "ciao", "hello"] -> "ciao" "hello" "ciao"
     * 
     * @param args The caller could pass us 0 ... n arguments
     */
    public static void main(String[] args) {
        int i = 0;
        System.out.println("My array has " + args.length + " elements.\n");
        System.out.println("With if:");
        // non va bene perché ripetiamo due volte la stessa istruzione
        if (args.length > 3) {
            while (i < 3) {
                System.out.println("The " + i + " element is: " + args[i]);
                i++;
            }

        } else {
            while (i < args.length) {
                System.out.println("The " + i + " element is: " + args[i]);
                i++;
            }
        }

        i = 0;
        System.out.println("\nWithout if:");
        int end = Math.min(3, args.length); // troviamo il minimo tra la lunghezza dell'array e 3
        while (i < end) {
            System.out.println("The " + i + " element is: " + args[i]);
            i++;
        }
    }
}
