package com.yk.pack5OOPPrinciples;

public class Less23Archer extends Less23Hero {

    private Wolf wolf;

    public Less23Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf1", 3);
    }

    @Override
    public void attackEnemy(Less23Enemy enemy) {
        System.out.println(getName() + " attacks enemy (Archer) " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Less23Enemy enemy) {
            System.out.println(name + " and " + Less23Archer.this.getName() + " damage the enemy together");
            enemy.takeDamage(damage + Less23Archer.this.getDamage());
        }

    }


}
