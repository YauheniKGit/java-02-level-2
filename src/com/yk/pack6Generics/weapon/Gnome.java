package com.yk.pack6Generics.weapon;

import com.yk.pack5OOPPrinciples.Less23Enemy;
import com.yk.pack5OOPPrinciples.Less23Hero;

public class Gnome<T extends Less27MeleeWeapon> extends Less23Hero<T> {

    public Gnome(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Less23Enemy enemy) {
        enemy.takeDamage(getDamage());
    }
}
