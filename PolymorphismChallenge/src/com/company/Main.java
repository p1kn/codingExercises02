package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }


    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate () {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> breake";
    }
}

class Octavia extends Car {
    public Octavia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Octavia -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Octavia -> accelerate()";
    }

    @Override
    public String brake() {
        return "Octavia -> break()";
    }
}

class Volkswagen extends Car {
    public Volkswagen(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Volkswagen -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Volkswagen -> accelerate()";
    }

    @Override
    public String brake() {
        return "Volkswagen -> break()";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Octavia octavia = new Octavia("Skoda Octavia", 4);
        System.out.println(octavia.startEngine());
        System.out.println(octavia.accelerate());
        System.out.println(octavia.brake());

        Volkswagen volkswagen = new Volkswagen("Volkswagen Passat", 4);
        System.out.println(volkswagen.startEngine());
        System.out.println(volkswagen.accelerate());
        System.out.println(volkswagen.brake());
    }
}
