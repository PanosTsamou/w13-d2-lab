package org.example;

import org.example.car.IMove;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double money;
    private ArrayList<IMove> collectionOfCars;


    public Customer(String name, double money, ArrayList<IMove> collectionOfCars) {
        this.name = name;
        this.money = money;
        this.collectionOfCars = collectionOfCars;
    }

    public void  addCar(IMove car){
        collectionOfCars.add(car);
    }
    public void reduceMonies(double amount){
        this.money -= amount;
    }
    public  IMove  getACarFromStock(IMove car){
        if (collectionOfCars.contains(car)) {
            return collectionOfCars.remove(collectionOfCars.indexOf(car));
        }
        return  null;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void addMoniesToWallet(double amount){
        this.money += amount;
    }
}
