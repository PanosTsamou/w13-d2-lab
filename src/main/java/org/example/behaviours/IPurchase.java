package org.example.behaviours;

public interface IPurchase {
    public double getMoney();
    public boolean canAfford(IBuyable car);
    public void   reduceMonies( double amount);
    public void buy(IBuyable car);
}
