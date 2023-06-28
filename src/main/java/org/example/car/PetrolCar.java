package org.example.car;

import org.example.carparts.Engine;
import org.example.carparts.Tyre;

public class PetrolCar extends Car {
    private String fuel;

    public PetrolCar(String brand, String model, String colour, String type, Engine engine, Gear gear, Tyre tyre, double price){
        super(brand, model, colour, type, engine, gear, tyre, price);
        this.fuel = "Petrol";
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public String move() {
        return "I can move with petrol";
    }
}
