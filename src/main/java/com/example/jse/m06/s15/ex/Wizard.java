package com.example.jse.m06.s15.ex;

public class Wizard extends Actor {

    protected Wizard(String name, int exp) {
        super(name, exp);
    }

    @Override
    public String toString() {
        return "Wizard [name=" + getName() + ", exp=" + getExp() + "]";
    }

    public boolean cast(Actor enemy) { // true if the current actor wins
        if (enemy instanceof Wizard) {
            if (this.getExp() > enemy.getExp() || this.getExp() == enemy.getExp()) {
                System.out.println(this.getName() + " casts a spell against " + enemy.getName());
                System.out.println(this.getName() + " won!");
                return true;
            }
        }
        if (enemy instanceof Warrior) {
            System.out.println(this.getName() + " casts a spell against " + enemy.getName());
            System.out.println(this.getName() + " won!");
            return true;
        }
        System.out.println(this.getName() + " casts a spell against " + enemy.getName());
        System.out.println(this.getName() + " lost!");
        return false;
    }

    @Override
    public boolean fight(Actor enemy) {
        return cast(enemy);
    }

}
