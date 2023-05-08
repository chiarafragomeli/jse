/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise_new {
    /**
     * Print all values in [0 .. 9] two times:
     * <li>By while loop
     * <li>By do-while loop
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String[] str = { "zero", "one", "two" };
        int i = 0;
        
        //WHILE
        System.out.println("While method");
        while(i < str.length)
        {
            System.out.println("The " + i + " element of my array is: " + str[i]);
            i++;
        }
        
        //DO-WHILE
        i=0;
        System.out.println("\n\nDo-while method");
        do
        {
            System.out.println("The " + i + " element of my array is: " + str[i]);
            i++;
        } while(i < str.length);
    }
}
