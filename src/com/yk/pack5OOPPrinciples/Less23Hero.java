package com.yk.pack5OOPPrinciples;

import com.yk.pack6Generics.weapon.Less27Weapon;

public abstract class Less23Hero<T extends Less27Weapon> {

    private final String name;
    private final int damage;
    private T weapon;

    public Less23Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Less23Enemy enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
