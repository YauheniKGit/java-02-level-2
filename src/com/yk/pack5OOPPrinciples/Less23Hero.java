package com.yk.pack5OOPPrinciples;

public abstract class Less23Hero {

    private final String name;
    private final int damage;

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

}
