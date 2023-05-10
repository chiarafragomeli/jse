package com.example.jse.m05.s03.MyCar;

public class Main {
    public static void main(String[] args) {
        MyCar car1 = new MyCar("Fiat", "Panda", "00000");
        MyCar car2 = new MyCar("Audi", "A4", "11111");
        String steerMess = car2.steerBool(true);
        //
        System.out.println(car1);
        System.out.println(car2);
        //
        System.out.println(car1.steerBool(false));
        System.out.println(steerMess);
    }
}
