package com.example.jse.m06.s15.ex;

public class Warrior extends Actor {

    public Warrior(String name, int exp) {
        super(name, exp);
    }

    @Override
    public String toString() {
        return "Warrior [name=" + getName() + ", exp=" + getExp() + "]";
    }

    public boolean punch(Actor enemy) { // true if the current actor wins
        if (enemy instanceof Warrior) {
            if (this.getExp() > enemy.getExp() || this.getExp() == enemy.getExp()) {
                System.out.println(this.getName() + " fights against " + enemy.getName());
                System.out.println(this.getName() + " won!");
                return true;
            }
        }
        if (enemy instanceof Wizard) {
            System.out.println(this.getName() + " fights against " + enemy.getName());
            System.out.println(enemy.getName() + " won!");
            return false;
        }
        System.out.println(this.getName() + " fights against " + enemy.getName());
        System.out.println(this.getName() + " lost!");
        return false;
    }

    @Override
    public boolean fight(Actor enemy) {
        return punch(enemy);
    }
}
