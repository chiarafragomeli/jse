/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07.ex;

/**
 * Override exercise
 * 
 * Complete the classes Cat, Dog, Mouse with a toString() override
 * 
 * Put instances of those classes in an array, and print them as strings
 */
public class Main {
    public static void main(String[] args) {
        Object tom = new Cat("Tom", 2);
        System.out.println(tom.toString());
        System.out.println("***");

        /*Dog dog = new Dog("Cane");
        Mouse mouse = new Mouse("Topo");*/

        // put a cat, a dog, and a mouse in the array
        Object[] objects = {tom, new Dog("Cane"), new Mouse("Topo")};
        /*objects[0] = tom;
        objects[1] = dog;
        objects[2] = mouse;*/

        System.out.println("My array is:");
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }
}
