package com.techreturners.cats;

public abstract class AbstractCat implements Cat {

    private boolean is_asleep;
    private int height;
    private String domestic_wild;

    public AbstractCat( String domestic_wild, int height) {
        this.is_asleep = false;
        this.height = height;
        this.domestic_wild = domestic_wild;
    }

    public boolean isAsleep() {
        return is_asleep;
    }
    public void goToSleep(){
        is_asleep = true;
    }
    public void wakeUp(){
        is_asleep = false;
    }

    public String getSetting(){
        return domestic_wild;
    }
    public int getAverageHeight(){
        return height;
    }
    public abstract String eat();
}