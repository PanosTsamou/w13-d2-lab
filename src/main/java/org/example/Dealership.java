package org.example;

import org.example.behaviours.IBuyable;
import org.example.behaviours.IMove;
import org.example.behaviours.IPurchase;
import org.example.behaviours.ISeller;

import java.util.ArrayList;

public class Dealership implements ISeller {
    private ArrayList<IBuyable> stock;
    private double till;

    public Dealership(ArrayList<IBuyable> stock, double till){
        this.stock = stock;
        this.till = till;
    }

    public double getTill() {
        return till;
    }

    public void addCarToStock(IBuyable car){
        this.stock.add(car);
    }
    public  IBuyable  getACarFromStock(IBuyable car){
        if (stock.contains(car)) {
            return stock.remove(stock.indexOf(car));
        }else {
            return  null;
        }

    }
    public void addMoniesToTill(double amount){
        this.till += amount;
    }

    public void reduceMonies(double amount){
        this.till -= amount;
    }

    public void sell(IBuyable car, IPurchase customer){
        customer.buy(getACarFromStock(car));
        addMoniesToTill(car.getPrice());
    }
}
