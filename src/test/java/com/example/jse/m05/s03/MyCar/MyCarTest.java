package com.example.jse.m05.s03.MyCar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyCarTest {

    private MyCar car = new MyCar("", "", ""); // not passing any parameters
    
    @Test
    void steerBoolLeft() {
        boolean input = true;
        String expected = "I steered on the left";
        String actual = car.steerBool(input);
        Assertions.assertEquals(expected,actual);
    }
    
    @Test
    void steerBoolRight() {
        boolean input = false;
        String expected = "I steered on the right";
        String actual = car.steerBool(input);
        Assertions.assertEquals(expected,actual);
    }
}
