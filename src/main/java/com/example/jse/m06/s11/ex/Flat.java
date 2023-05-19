/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * Flat is-a Conditioning
 */
public class Flat implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    String address;

    public Flat(String address) {
        log.info("Flat created with number plate: " + address);
        this.address = address;
    }


    @Override
    public void tempCond(int t) {
        log.info("Flat temperature is " + t);
    }

    @Override
    public String toString() {
        return "Flat [address=" + address + "]";
    }

}
