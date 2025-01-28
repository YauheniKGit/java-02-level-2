package com.yk.pack5OOPPrinciples;

public class Less23PracticeRunner {

    public static void main(String[] args) {
        Less23Hero warriorAragorn = new Less23Warrior("Warrior-Aragorn", 20);
        Less23Hero mageGendolf = new Less23Mage("Mage-Gendolf", 30);


        Less23Hero archerLegalas = new Less23Archer("Archer-Legalas", 10);

        Less23Enemy ork = new Less23Enemy("Ork", 100);

        checkAttack(ork, warriorAragorn, mageGendolf, archerLegalas);

        Less23Mortalable less23Enemy = new Less23Enemy("Name", 12);
        less23Enemy.isAlive();

    }

    public static void checkAttack(Less23Enemy enemy, Less23Hero... heroes) {
        while (enemy.isAlive()) {
            for (Less23Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}


