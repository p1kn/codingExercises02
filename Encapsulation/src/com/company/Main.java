package com.company;

public class Main {

    public static void main(String[] args) {


//        Player player = new Player();
//        player.name = "Macio";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Reamaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Reamaining health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Macio", 500, "Sword");
        System.out.println("initial health is " + player.getHealth());
    }
}
