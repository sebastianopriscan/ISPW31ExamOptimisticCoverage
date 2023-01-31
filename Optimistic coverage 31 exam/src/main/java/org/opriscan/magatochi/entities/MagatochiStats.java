package org.opriscan.magatochi.entities;

public class MagatochiStats {

    private int hunger;

    private int thirst;

    private int fun;

    private boolean isAlive ;

    private int age ;

    public MagatochiStats(int hunger, int thirst, int fun, boolean isAlive ,int age) {
        this.hunger = hunger ;
        this.thirst = thirst ;
        this.age = age ;
        this.fun = fun ;
        this.isAlive = isAlive ;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getFun() {
        return fun;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getAge() {
        return age;
    }
}
