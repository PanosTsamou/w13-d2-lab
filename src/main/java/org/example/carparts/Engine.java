package org.example.carparts;

public class Engine {
    private double size;
    private String id;
    private String brand;

    public Engine(String brand, String id, double size){
        this.brand = brand;
        this.id = id;
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }
    public String getSizeAsString(){
        String result = size + " cc";
        return result;
    }

}
