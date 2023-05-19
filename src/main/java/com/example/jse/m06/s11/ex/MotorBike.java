/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * MotorBike is-a Vehicle
 */
public class MotorBike extends Vehicle {
    private static final Logger log = Logger.getGlobal();

    String plate;

    public MotorBike(String plate) {
        log.info("MotorBike created with number plate: " + plate);
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "MotorBike [plate=" + plate + "]";
    }
}
