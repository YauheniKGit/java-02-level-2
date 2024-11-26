package com.yk.pack5OOPPrinciples;

import com.yk.pack6Generics.weapon.Less27MeleeWeapon;

public class Less23Warrior<T extends Less27MeleeWeapon> extends Less23Hero<T> {

    public Less23Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Less23Enemy enemy) {
        System.out.println(getName() + " attacks enemy (Warrior class) " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
