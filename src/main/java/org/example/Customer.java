package org.example;

import org.example.behaviours.IBuyable;
import org.example.behaviours.IMove;
import org.example.behaviours.IPurchase;

import java.util.ArrayList;

public class Customer implements IPurchase {
    private String name;
    private double money;
    private ArrayList<IBuyable> collectionOfCars;


    public Customer(String name, double money, ArrayList<IBuyable> collectionOfCars) {
        this.name = name;
        this.money = money;
        this.collectionOfCars = collectionOfCars;
    }

    public void  addCar(IBuyable car){
        collectionOfCars.add(car);
    }
    public void reduceMonies(double amount){
        this.money -= amount;
    }
    public  IBuyable  getACarFromStock(IBuyable car){
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

    public boolean canAfford(IBuyable car){
        if (car.getPrice() <= money){
            return true;
        }
        return false;
    }
    public  void  buy(IBuyable car){
        if (canAfford(car)){
            reduceMonies(car.getPrice());
            addCar(car);
        }
    }

}
