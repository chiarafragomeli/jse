/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
    /**
     * Create a bunch of actors
     * <p>
     * Let them fight against each others
     * <p>
     * Peer-to-peer fight, the most skilled one wins
     * <p>
     * Wizards always beat warriors
     * <p>
     * In the end, let the user knows who survived
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // create actors, both warriors and wizards
        List<Actor> actors = new ArrayList<>(List.of(new Warrior("Aragorn", 20), new Warrior("Boromir", 18),
                new Wizard("Gandalf", 40), new Wizard("Saruman", 35)));

//        Actor[] actors = { new Warrior("Aragorn", 20), new Warrior("Boromir", 18), new Wizard("Gandalf", 40),
//                new Wizard("Saruman", 35) };

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        boolean winner = false;

        System.out.println("\nLet's fight ...\n");
        
        for (Actor actor : actors) {
            for (Actor actor2 : actors) {
                if (actor != actor2) {
                    System.out.println("Fighters: " + actor + " vs " + actor2);
                    winner = actor.fight(actor2);
                    System.out.println("\n");
                    if (winner) {
                        actors.remove(actor2);
                    } else {
                        actors.remove(actor);
                    }
                }
            }
        }
        System.out.println("Survivors:\n");

        System.out.println(actors);

    }
}
