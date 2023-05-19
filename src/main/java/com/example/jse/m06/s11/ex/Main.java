/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.Arrays;

/**
 * Interface vs class exercise
 */
public class Main {
    /**
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // (1) put objects of (at least) three different types in this array
        Vehicle[] vehicles = { new MotorBike("A7363"), new Bus("D3938"), new Car("J2836") };
        System.out.println(Arrays.toString(vehicles) + "\n");

        // (2) let all vehicle steer in alternate directions
        for (int i = 0; i < vehicles.length; i++) {
            if (i % 2 == 0) {
                System.out.print(vehicles[i] + " ");
                vehicles[i].steer(Direction.LEFT);
            } else {
                System.out.print(vehicles[i] + " ");
                vehicles[i].steer(Direction.RIGHT);
            }
        }

        System.out.println(" ");
        // (3) put objects of (at least) three different types in this array
        Conditioning[] conditionings = { new Bus("B6567"), new Flat("Corsica 43"), new Car("F8363") };
        System.out.println(Arrays.toString(conditionings));

        // (4) set the temperature of each conditioned to 20
        for (int i = 0; i < conditionings.length; i++) {
            conditionings[i].tempCond(20);
        }
    }
}
