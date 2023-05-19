package com.example.jse.m06.examples02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Dog[] dogs = { new Dog(100), new Shiba(89), new Husky(200) };

        System.out.println(Arrays.toString(dogs));

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].bark();
        }

        System.out.println("\n");
        f(dogs[dogs.length - 1]);
    }

    public static void f(Dog dog) {
        dog.setFrequency(Dog.HIGHEST_FREQUENCY);
        if (dog.getFrequency() <= 90) {
            System.out.println("Frequency too low!");
        } else {
            dog.bark();
        }
    }
}
