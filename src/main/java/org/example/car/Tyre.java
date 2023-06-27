package org.example.car;

import java.sql.PreparedStatement;

public class Tyre {
    private String brand;
    private float size;
    private Weather weather;

    public Tyre(String brand, float size, Weather weather){
        this.brand = brand;
        this.size = size;
        this.weather = weather;
    }

    public String getBrand() {
        return brand;
    }

    public float getSize() {
        return size;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getSizeAsString(){
        String result = getSize() + " inches";
        return result;
    }
}
