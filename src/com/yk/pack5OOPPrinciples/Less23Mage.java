package com.yk.pack5OOPPrinciples;

import com.yk.pack6Generics.weapon.Less27MagicWeapon;

public class Less23Mage<T extends Less27MagicWeapon> extends Less23Hero<T> {

    public Less23Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Less23Enemy enemy) {
        System.out.println(getName() + " attacks enemy (Mage class) " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

}
