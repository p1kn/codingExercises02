package com.company;

public class EnhancedPlayer {

    private String name;
    private int hitPoint = 100;
    private String Weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0  && health <= 100) {
            this.hitPoint = health;
        }
        Weapon = weapon;
    }

    public void loseHealth (int damage) {
        this.hitPoint = this.hitPoint - damage;
        if (this.hitPoint <= 0) {
            System.out.println("Player knocked out");
            //Reduce number of lives remaining fot the player
        }
    }

    public int getHealth() {
        return hitPoint;
    }
}
