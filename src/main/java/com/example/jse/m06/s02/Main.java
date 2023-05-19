package com.example.jse.m06.s02;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString());

        Cat cat = new Cat("Tom");
        System.out.println(cat);

        Tubby tub = new Tubby("Tub");
        System.out.println(tub);
        // nella sottoclasse Tubby non abbiamo fatto l'override di toString,
        // quindi viene invocato il metodo toString di Cat
    }
}
