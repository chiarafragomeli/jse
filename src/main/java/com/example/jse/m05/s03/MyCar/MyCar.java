package com.example.jse.m05.s03.MyCar;

public class MyCar {
    /*
     * fields of my class
     */
    private String brand;
    private String model;
    private String plate;

    /*
     * CTOR (Source - Generate constructor)
     */
    public MyCar(String brand, String model, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }

    /*
     * to print object with its fields in main (Source - Generate to String)
     */
    @Override
    public String toString() {
        return "MyCar [brand=" + brand + ", model=" + model + ", plate=" + plate + "]";
    }

    /*
     * methods of my class
     */
    public String steerBool(boolean dir) {
        return "I steered on the " + (dir ? "left" : "right");
    }

}
