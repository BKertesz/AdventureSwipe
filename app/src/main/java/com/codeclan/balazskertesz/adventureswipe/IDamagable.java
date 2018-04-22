package com.codeclan.balazskertesz.adventureswipe;

public interface IDamagable {

    public void changeHealth(int amount);

    public boolean isDead();

    public void attack(IDamagable target);
}
