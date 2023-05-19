/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s10;

/**
 * Inheritance
 */
public class Main {
    /**
     * A few interconnected objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Object[] objects = { new Man("Tom"), Werewolf.createByHumanThenWolfishName("Wally","Bad Wally"), new Wolf() };
       // Man[] men = { new Man("Tom"), new Werewolf("Wally") };
       // Wolfable[] wolfishes = { new Werewolf("Wally"), new Wolf() };

        for (Object object : objects) {
            System.out.println(object.toString());
        }

        Werewolf ww = Werewolf.createByHumanThenWolfishName("Uli", "Bad Uli");
        ww.howl();
        ww.sayHello();
        ww.sayHowllo();
    }
}
