/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise5 {
    /**
     * Emulate multiplicative operators with the help of while or do-while loops.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int multi = a * b;
        System.out.println("\na * b = " + multi);
        ////////
        // TODO (1) Get the same result without multiplying
        int i = 0;
        int myMulti = 0;
        while (i < b) {
            myMulti += a;
            i++;
        }
        System.out.println("\nMy multiplication is: " + myMulti);
        /////////
        int div = a / b;
        System.out.println("\na / b = " + div);
        // TODO (2) Get the same result without dividing
        i = 0;
        //if (a > b && b != 0) {
            int divisor = Math.min(a, b);
            int dividend = Math.max(a, b);
            int myDiv = dividend;

            while (myDiv > divisor) { // deve continuare il loop finché non posso più sottrarre il divisore dal
                                      // dividendo
                myDiv = myDiv - divisor;
                i++;
            }
            System.out.println("\nMy division is: " + i);
            System.out.println("\nMy modulo is: " + myDiv);
        //} else {
        //    System.out.println("\nI can't make this division!");
        //}
        ////////
        int mod = a % b;
        System.out.println("\na % b = " + mod);
        // TODO (3) Get the same result without using the modulo operator

        // System.out.println("\nMy modulo is: " + myDiv);
    }
}
