package org.example.car;

public class DieselCar extends Car{

    private String fuel;

    public DieselCar(String brand, String model, String colour, String type, Engine engine, Gear gear, Tyre tyre, double price){
        super(brand, model, colour, type, engine, gear, tyre, price);
        this.fuel = "Diesel";
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public String move() {
        return "I can move with Diesel";
    }
}
