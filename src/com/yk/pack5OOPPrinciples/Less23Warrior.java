package com.yk.pack5OOPPrinciples;

public class Less23Warrior extends Less23Hero {

    public Less23Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Less23Enemy enemy) {
        System.out.println(getName() + " attacks enemy (Warrior class) " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
