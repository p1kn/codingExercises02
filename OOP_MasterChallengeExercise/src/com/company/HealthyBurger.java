package com.company;

public class HealthyBurger extends Hamburger {

    private String name;
    private int basePrice;
    private int finalPrice;
    private String rollType;
    private String meat;
    private boolean cucumber;
    private boolean bean;

    public HealthyBurger(boolean lettuce, boolean tomato, boolean carrot, boolean onion, boolean cucumber, boolean bean) {
        super(lettuce, tomato, carrot, onion);
        this.name = "Healthy Hamburger";
        this.basePrice = 22;
        this.finalPrice = 22;
        this.rollType = "Brown rye bread";
        this.meat = "Fish";
        this.cucumber = cucumber;
        if (cucumber) {
            this.finalPrice += 1;
        }
        this.bean = bean;
        if (bean) {
            this.finalPrice += 1;
        }


    }

    @Override
    public void showBasePrice() {

    }
}
