package com.codeclan.balazskertesz.adventureswipe;

public class Player implements IDamagable {

    private int health;
    private int stamina;
    private int gold;
    private Item equipment;

    public Player(int health, int stamina, Item equipment) {
        this.health = health;
        this.stamina = stamina;
        this.equipment = equipment;
        this.gold = 0;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getGold() {
        return gold;
    }

    public Item getEquipment() {
        return equipment;
    }

    public void changeEquipment(Item item){
        this.equipment = item;
    }

    public void pickUpGold(int amount){
        this.gold += amount;
    }

    public void changeHealth(int amount){
        this.health += amount;
    }

    public void changeStamina(int amount){
        this.stamina += amount;
    }

    public boolean isDead(){
        if(health<= 0){
            return true;
        }
        else{
            return false;
        }
    }
}
