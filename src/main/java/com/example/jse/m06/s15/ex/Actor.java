/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15.ex;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Actor {
    
    private String name;
    private int exp;
    private boolean alive;
    
    /**
     * Canonical constructor
     * 
     * @param name the actor name
     */
    protected Actor(String name, int exp) {
        this.name = name;
        this.exp = exp;
        this.alive = true;
    }
    
    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }
    
    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Actor [name=" + name + ", exp=" + exp + "]";
    }

    /**
     * Fight against an enemy
     * 
     * @param enemy another actor
     * @return true if the current actor wins
     */
    public abstract boolean fight(Actor enemy);


}
