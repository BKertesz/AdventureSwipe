package com.codeclan.balazskertesz.adventureswipe;

public enum CreatureType {

    SLIME("Slime",5,-2),
    GOBLIN("Goblin",8,-3),
    SKELETON("Skeleton",6,-4),
    DRAGON("Dragon",20,-15),
    TROLL("Troll",15,-12),
    KOBOLD("Kobold",8,-2),
    ZOMBIE("Zombie",8,-2),
    ORC("Orc",12,-8),
    DIREWORLF("Dire Wolf",10,-5),
    SIMON("Simon",25,-12),
    GIANTANT("Giant Ant",8,-6);

    String name;
    int health;
    int damage;


    CreatureType(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
