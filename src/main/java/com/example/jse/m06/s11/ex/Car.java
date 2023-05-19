/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * Car is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    String plate;

    public Car(String plate) {
        log.info("Car created with number plate: " + plate);
        this.plate = plate;
    }

    @Override
    public void tempCond(int t) {
        log.info("Car temperature is " + t);
    }

    @Override
    public String toString() {
        return "Car [plate=" + plate + "]";
    }
}
