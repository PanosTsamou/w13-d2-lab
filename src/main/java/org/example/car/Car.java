package org.example.car;

public abstract class Car implements IMove{
    private String brand;
    private String model;
    private String colour;
    private String type;
    private Tyre tyre;
    private Engine engine;
    private double price;
    private Gear gear;

    public Car(String brand, String model, String colour, String type, Engine engine, Gear gear, Tyre tyre, double price){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.engine = engine;
        this.gear = gear;
        this.tyre = tyre;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public String getTyreSizeAsString(){
        return tyre.getSizeAsString();
    }

    public Engine getEngine() {
        return engine;
    }

    public String getEngineAsString(){
        return engine.getSizeAsString();
    }

    public Gear getGear() {
        return gear;
    }
    public abstract String move();
}
