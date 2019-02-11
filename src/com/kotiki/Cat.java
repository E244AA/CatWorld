package com.kotiki;

import java.util.Random;

public class Cat {

    private String name;
    private boolean male;
    private int age;
    private int hp;
    private int hunger;
    private int famaly;
    private Cat spouse = null;

    public Cat(String name, int famaly){
        Random r = new Random();

        int a = r.nextInt(1);
        a == 0 ? this.male = true : this.male = false;
        
        this.name = name;
        this.age = 0;
        this.hunger = 100;
        this.famaly = famaly;
        this.hp = r.nextInt(100);
    }

    private boolean isAlive(){
        return hp > 0 ? true : false;
    }
    private boolean isHunger(){
        return hunger > 50 ? false : true;
    }


    private void marry(Cat spouse){
        if(this.age >= 18) this.spouse = spouse;
    }

    private void giveBirth(){
        if(spouse != null){
            
        }
    }

}
