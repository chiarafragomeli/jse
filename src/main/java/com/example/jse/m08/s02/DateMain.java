/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m08.s02;

import java.util.Date;

/**
 * java util Date
 */
public class DateMain {
    /**
     * Basics on date
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date: " + date);

        date.setTime(date.getTime() - 1_000_000_000);
        System.out.println("Moving back one billion ms: " + date);

        System.out.println("Nine hundred billion ms in the UNIX epoch: " + new Date(900_000_000_000L));

        Date base = new Date(0L);
        System.out.println("Base time: " + base);
    }
}
