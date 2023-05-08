/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

import java.util.Arrays;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise2 {
    /**
     * Swap the values in the defined flags array two times, and print it each time:
     * <li>By while loop
     * <li>By do-while loop
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        boolean[] flags = { true, false, false };
        System.out.println(Arrays.toString(flags));
        
        int i = 0;
        while (i<flags.length) {
            /*if (flags[i] == true) {
                flags[i] = false;
            } else {
                flags[i] = true;
            }
            */
            
            flags[i] = !flags[i];
            
            i++;
        }
        System.out.println(Arrays.toString(flags));
        
        i = 0;
        
        do {
            if (flags[i] == true) {
                flags[i] = false;
            } else {
                flags[i] = true;
            }
            i++;
        } while (i<flags.length);
        System.out.println(Arrays.toString(flags));
        
        
        
        

        /*int i = 0;
        int j = 0;
        System.out.println("\nDo method\n");
        while (j < 2) {
            while (i < flags.length) {
                if (flags[i] == true) {
                    flags[i] = false;
                } else {
                    flags[i] = true;

                }
                i++;
            }
            System.out.println("My " + j + " times swapped arrays is:");
            System.out.println(Arrays.toString(flags) + "\n");
            i = 0;
            j++;
        }
        System.out.println("\nMy two times swapped arrays is:");
        System.out.println(Arrays.toString(flags));

        System.out.println("\nDo-while method\n");
        j = 0;
        i=0;*/
    }
}