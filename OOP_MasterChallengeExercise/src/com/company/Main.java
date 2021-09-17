package com.company;

public class Main {

    public static void main(String[] args) {
Hamburger hamburger = new Hamburger(true,true,true,true);
        System.out.println(hamburger.getBasePrice());
        System.out.println(hamburger.getFinalPrice());
        hamburger.showBasePrice();

        HealthyBurger  healthyBurger = new HealthyBurger(true,true,true,true,true,true);

    }
}
