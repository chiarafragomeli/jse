package com.example.jse.m06.s02;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override // se tolgo questo override devo invocare il toString dal main
    public String toString() {
        return "Cat [name=" + name + "]";
    }

}
