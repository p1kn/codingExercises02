package com.company;

public class Hamburger {

    private String name;
    private int basePrice;
    private int finalPrice;
    private String rollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;

    public Hamburger(boolean lettuce, boolean tomato, boolean carrot, boolean onion) {

        this.name = "Classic Hamburger";
        this.basePrice = 20;
        this.finalPrice = 20;
        this.rollType = "White rye bread";
        this.meat = "Beef";
        this.lettuce = lettuce;
        if (lettuce) {
            this.finalPrice += 1;
        }
        this.tomato = tomato;
        if (tomato) {
            this.finalPrice += 1;
        }
        this.carrot = carrot;
        if (carrot) {
            this.finalPrice += 1;
        }
        this.onion = onion;
        if (onion) {
            this.finalPrice += 1;
        }
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public void showBasePrice() {
        System.out.println("Cost of: " + getName() + " with " + getMeat() + " & " + getRollType() + " is: " + getBasePrice());
        if (lettuce){
            System.out.println("+ lettuce cost = 1");
        }
        if (tomato){
            System.out.println("+ tomato cost = 1");
        }
        if (carrot){
            System.out.println("+ carrot cost = 1");
        }
        if (onion){
            System.out.println("+ onion cost = 1");
        }
        System.out.println("Final price is: " + getFinalPrice());
    }

}
