/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise3 {
    /**
     * Using while or do-while, print:
     * <li>The number of arguments passed to this main
     * <li>Each passed argument
     * 
     * @param args each argument is going to be printed
     */
    public static void main(String[] args) {
        int i = 0;
        System.out.println("The number of arguments is " + args.length);
        while (i < args.length) {
            System.out.println("The " + i + " argument is: " + args[i]);
            i++;
        }
    }
}
