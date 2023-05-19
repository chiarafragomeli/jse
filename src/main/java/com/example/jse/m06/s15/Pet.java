/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15;

/**
 * Pet is a Brushable
 */
public abstract class Pet implements Brushable { // è una classe astratta e non può essere istanziata, ma può avere classi figlie
    private String name;

    /**
     * Canonical constructor
     * 
     * @param name the pet name
     */
    protected Pet(String name) {
        this.name = name;
    }

    /**
     * Getter
     * 
     * @return the pet name
     */
    public String getName() {
        return name;
    }

    @Override
    public void brush() {
        System.out.println("Brushing " + name);
    }

    /**
     * The specific noise for a pet. Each pet should have its own
     */
    public abstract void makeNoise(); // metodo astratto: è un metodo privo di implementazione che fa parte di una classe astratta
}