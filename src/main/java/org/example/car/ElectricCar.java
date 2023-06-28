package org.example.car;

import org.example.carparts.Engine;
import org.example.carparts.Tyre;

public class ElectricCar extends Car  {
    private String fuel;

    public ElectricCar(String brand, String model, String colour, String type, Engine engine, Gear gear, Tyre tyre, double price){
        super(brand, model, colour, type, engine, gear, tyre, price);
        this.fuel = "Electric";
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public String move() {
        return "I love saving the planet";
    }
}
