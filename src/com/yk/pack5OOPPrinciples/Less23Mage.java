package com.yk.pack5OOPPrinciples;

public class Less23Mage extends Less23Hero {

    public Less23Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Less23Enemy enemy) {
        System.out.println(getName() + " attacks enemy (Mage class) " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

}
