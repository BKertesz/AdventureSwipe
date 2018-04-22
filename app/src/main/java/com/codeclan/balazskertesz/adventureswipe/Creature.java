package com.codeclan.balazskertesz.adventureswipe;

import java.util.Random;

public class Creature implements IDamagable {

    private int health;
    private int damage;
    private String name;

    public Creature(String name,int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public Creature(){
        CreatureType seed = getRandomCreature();
        this.name = seed.getName();
        this.health = seed.getHealth();
        this.damage = seed.getDamage();
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void changeHealth(int amount){
        this.health += amount;
    }

    public boolean isDead(){
        if(health<= 0){
            return true;
        }
        else{
            return false;
        }
    }

    public CreatureType getRandomCreature(){
        CreatureType randomCreatureType;
        Random random = new Random();
        int createNumber = random.nextInt(CreatureType.values().length);
        return randomCreatureType = CreatureType.values()[createNumber];
    }
}
