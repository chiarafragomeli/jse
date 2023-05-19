/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s10;

/**
 * A man-wolf. Can't extends more than one class, so extends Man and implements
 * Wolfable
 */
public class Werewolf extends Man implements Wolfable {
    // !!! BAD idea, see Man.name !!! TODO: fix the mistake
    private String wwName;

    /**
     * Canonical constructor
     * 
     * @param name the werewolf name
     */
    public Werewolf(String manName, String wwName) {
        // more info on super soon
        super(manName); // uso il name della classe Man perché Werewolf è una subclass
        this.wwName = wwName;
    }
    /*
     * static factory method per disambiguare i due nomi del werewolf
     */
    public static Werewolf createByHumanThenWolfishName(String manName, String wwName) {
       return new Werewolf(manName, wwName);
    }
    
    /**
     * Specific werewolf method, something in between howl() and Man::sayHello()
     */
    public void sayHowllo() {
        System.out.println("Howllo, I'm " + wwName); // per accedere al dato privato Man.name devo usare un getter
    }

    @Override
    public void howl() {
        System.out.println("Howhowl, I'm " + wwName);
    }

    @Override
    public void attack(Man man) {
        System.out.printf("%s is attacking %s%n", getName(), man);
    }

    @Override
    public String toString() {
        return "A Werewolf named " + wwName;
    }
}
