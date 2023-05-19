/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    @Override
    public String toString() {
        return "Bus [plate=" + plate + "]";
    }

    String plate;

    public Bus(String plate) {
        log.info("Bus created with number plate: " + plate);
        this.plate = plate;
    }


    @Override
    public void tempCond(int t) {
        log.info("Bus temperature is " + t);
    }
}
