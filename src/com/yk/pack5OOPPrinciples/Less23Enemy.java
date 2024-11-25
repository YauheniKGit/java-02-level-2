package com.yk.pack5OOPPrinciples;

public class Less23Enemy implements Less23Mortalable {

    private final String name;
    private int health;

    public Less23Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive(){
        return health > 0;
    }

    public void takeDamage(int damage) {
        health = Math.max(health - damage, 0);
        if(health != 0) {
            System.out.println(name + " got damage " + damage + ". Left health: " + health);
        }else{
            System.out.println(name + " got damage " + damage + ". Left health: " + health + " " + name + " died.");
        }
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

}
