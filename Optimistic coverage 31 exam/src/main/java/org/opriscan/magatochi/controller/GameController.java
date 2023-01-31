package org.opriscan.magatochi.controller;

import org.opriscan.magatochi.entities.Beverage;
import org.opriscan.magatochi.entities.Food;
import org.opriscan.magatochi.entities.Magatochi;
import org.opriscan.magatochi.entities.MagatochiStats;
import org.opriscan.magatochi.exceptions.MagatochiException;

public class GameController {

    private static final int GAME_DAYS = 1000 ;

    private static int days = 0;

    private static MagatochiStats lastStats = Magatochi.getInstance().liveADay() ;

    private final Magatochi magatochi = Magatochi.getInstance() ;

    public void feedMagatochi() throws MagatochiException {
        if (days == GAME_DAYS) throw new MagatochiException() ;
        lastStats = magatochi.liveADay() ;
        days = lastStats.getAge() ;
        if (!lastStats.isAlive()) throw new MagatochiException() ;
        magatochi.giveFood(new Food());
    }

    public void drinkMagatochi() throws MagatochiException {
        if (days == GAME_DAYS) throw new MagatochiException() ;
        lastStats = magatochi.liveADay() ;
        days = lastStats.getAge() ;
        if (!lastStats.isAlive()) throw new MagatochiException() ;
        magatochi.giveBeverage(new Beverage()) ;
    }

    public void playWithMagatochi() throws MagatochiException {
        if (days == GAME_DAYS) throw new MagatochiException() ;
        lastStats = magatochi.liveADay() ;
        days = lastStats.getAge() ;
        if (!lastStats.isAlive()) throw new MagatochiException() ;
        magatochi.play();
    }

    public void advanceGame() throws MagatochiException {
        if (days == GAME_DAYS) throw new MagatochiException() ;
        lastStats = magatochi.liveADay() ;
        days = lastStats.getAge() ;
        if (!lastStats.isAlive()) throw new MagatochiException() ;
    }

    public MagatochiStats getStats() {
        return lastStats ;
    }
}
