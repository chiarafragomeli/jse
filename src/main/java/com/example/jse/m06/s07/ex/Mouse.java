/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07.ex;

/**
 * Override exercise
 * 
 * Any class derives from Object, implicitly or explicitly
 */
public class Mouse {
    private String name;
    
    public Mouse(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Mouse [name = " + name + "]";
    }


}
