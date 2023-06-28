package org.example.behaviours;

public interface ISeller {
    public void sell(IBuyable car, IPurchase buyer);
    public void addMoniesToTill(double amount);
}
