package com.yk.pack6Generics;

import com.yk.pack5OOPPrinciples.Less23Archer;
import com.yk.pack5OOPPrinciples.Less23Hero;
import com.yk.pack5OOPPrinciples.Less23Warrior;
import com.yk.pack6Generics.weapon.*;

public class Less27WeaponRunner {

    public static void main(String[] args) {
        Less23Archer<Less27Bow> archer = new Less23Archer<>("Legalas", 20);
        archer.setWeapon(new Less27Bow());

        Less23Warrior<Less27Sword> warrior = new Less23Warrior<>("Baromir", 30);
        warrior.setWeapon(new Less27Sword());

        Gnome<Axe> gnome = new Gnome<>("Gemle", 60);
        gnome.setWeapon(new Axe());

        printWeaponDamage(warrior);
        printWeaponDamage(gnome);
    }

    public static void printWeaponDamage(Less23Hero<? extends Less27MeleeWeapon> hero) {
        Less27MeleeWeapon weapon = hero.getWeapon();
//        hero.setWeapon(new Axe());
        System.out.println(hero.getWeapon().getDamage());
    }

}
