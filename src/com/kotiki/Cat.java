package com.kotiki;

import java.util.Random;

public class Cat {

    private String name;
    private boolean male;
    private int age;
    private int hp;
    private int hunger;

    public Cat(String name, boolean male){
        this.name = name;
        this.male = male;
        this.age = 0;
        this.hunger = 100;

        Random r = new Random();
        this.hp = r.nextInt(100);
    }

    private boolean isAlive(){
        return hp > 0 ? true : false;
    }

    private boolean isHunger(){
        return hunger > 50 ? false : true;
    }

}
