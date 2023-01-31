package org.opriscan.magatochi.entities;

public class Magatochi {

    private static Magatochi instance = null;

    private final int HUNGER_MAX = 100 ;

    private final int THIRST_MAX = 100 ;

    private final int FUN_MAX = 100 ;

    private int hunger = 100;

    private int thirst = 100;

    private int fun = 100;

    private boolean isAlive = true ;

    private int age = 1 ;

    private Magatochi() {

    }

    public static synchronized Magatochi getInstance() {
        if(instance == null) instance = new Magatochi() ;
        return instance ;
    }

    public void giveFood(Food food) {
        this.hunger = Math.min(hunger + food.getValue(), HUNGER_MAX) ;
    }

    public void giveBeverage(Beverage beverage) {
        thirst = Math.min(thirst + beverage.getValue(), THIRST_MAX) ;
    }

    public void play() {
        fun = Math.max(fun +1, FUN_MAX) ;
    }

    public MagatochiStats liveADay() {
        if(!isAlive) return new MagatochiStats(0,0,0,false, age) ;

        if(hunger == 0 || thirst == 0) die() ;

        hunger = Math.max(hunger -1, 0) ;
        thirst = Math.max(thirst -1, 0) ;
        fun = Math.max(fun -1, 0) ;
        age++ ;

        return new MagatochiStats(hunger, thirst, fun, isAlive, age) ;
    }

    private void die() {
        isAlive = false ;
    }
}
