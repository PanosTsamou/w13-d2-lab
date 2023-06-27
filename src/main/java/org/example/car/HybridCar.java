package org.example.car;

public class HybridCar extends Car {
    private String fuel1;
    private String fuel2;
    public HybridCar(String brand, String model, String colour, String type,
                     Engine engine, Gear gear, Tyre tyre, double price, String fuel1, String fuel2){
        super(brand, model, colour, type, engine, gear, tyre, price);
        this.fuel1 = fuel1;
        this.fuel2 = fuel2;
    }

    public String getFuel1() {
        return fuel1;
    }

    public String getFuel2() {
        return fuel2;
    }

    public String getCarFuel(){
        return getFuel1() + "/" + getFuel2();
    }

    @Override
    public String move() {
        return "I can move with " + getCarFuel();
    }
}
