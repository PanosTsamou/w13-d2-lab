package org.example;

import org.example.car.IMove;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<IMove> stock;
    private double till;

    public Dealership(ArrayList<IMove> stock, double till){
        this.stock = stock;
        this.till = till;
    }

    public double getTill() {
        return till;
    }

    public void addCarToStock(IMove car){
        this.stock.add(car);
    }
    public  IMove  getACarFromStock(IMove car){
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

    public void buy(IMove car, Customer customer){
        IMove carWantToBuy = getACarFromStock(car);
        customer.addCar(carWantToBuy);
        customer.reduceMonies(carWantToBuy.getPrice());
        addMoniesToTill(carWantToBuy.getPrice());
    }
}
