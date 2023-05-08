/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12.ex;

/**
 * Control flow - Loop: for
 */
public class Exercise5 {
    /**
     * Emulate multiplicative operators with the help of a for loop.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        int multi = a * b;
        System.out.println("a * b = " + multi);
        int myMulti = 0;
        for (int i = 0; i < b; i++) {
            myMulti += a;
        }
        System.out.println("\nMy multiplication is: " + myMulti);

        int div = a / b;
        System.out.println("\na / b = " + div);
        // TODO (2) Get the same result without dividing

        int divisor = Math.min(a, b);
        int dividend = Math.max(a, b);
        int myDiv = dividend;
        int i = 0;
        for (myDiv = dividend; myDiv > divisor; myDiv -= divisor) {
            i++;
        }
        System.out.println("\nMy division is: " + i);
        System.out.println("\nMy modulo is: " + myDiv);
        int mod = a % b;
        System.out.println("\na % b = " + mod);
        // TODO (3) Get the same result without using the modulo operator
    }
}
