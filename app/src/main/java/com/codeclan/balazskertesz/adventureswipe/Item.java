package com.codeclan.balazskertesz.adventureswipe;

public class Item {

    private String name;
    private int impact;
    private ItemType type;

    public Item(String name, int impact, ItemType type) {
        this.name = name;
        this.impact = impact;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getImpact() {
        return impact;
    }

    public ItemType getType() {
        return type;
    }

    public void use(IDamagable target) {
        target.changeHealth(impact);
    }
}
