import org.example.Customer;
import org.example.Dealership;
import org.example.behaviours.IBuyable;
import org.example.behaviours.IMove;
import org.example.car.*;
import org.example.carparts.Engine;
import org.example.carparts.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Car car1;
    Car car2;
    Car car3;
    Customer customer;
    Dealership dealership;
    Engine engine;
    Tyre tyre1;
    Tyre tyre2;

    @Before
    public void before(){
        engine = new Engine("Leman", "1234556789", 1900);
        tyre1 = new Tyre("Mechellin", 19, Weather.SNOW);
        tyre2 = new Tyre("Bad tyre", 15, Weather.RAIN);
        car1 = new PetrolCar("BMW", "2019", "Blue", "SUV", engine, Gear.AUTOMATIC, tyre1, 40000);
        car2 = new PetrolCar("Audi", "2020", "Blue", "Sports", engine, Gear.MANUAL, tyre2, 20000);
        car3 = new PetrolCar("Toyota", "2000", "white", "Pick-up", engine, Gear.MANUAL, tyre1, 10000);
        ArrayList<IBuyable> collCar = new ArrayList<>();
        collCar.add((IBuyable) car3);
        ArrayList<IBuyable> stockCar = new ArrayList<>();
        stockCar.add((IBuyable) car2);
        stockCar.add((IBuyable) car1);
        customer = new Customer("Panos", 30000, collCar);
        dealership = new Dealership(stockCar, 100000);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(30000, customer.getMoney(),.00);
    }

    @Test
    public void customerCanBuyCar(){
        customer.buy(car2);
        assertEquals(10000, customer.getMoney(), .0);
    }
    @Test
    public void canBuyFromDealer(){
        dealership.sell(car2, customer);
        assertEquals(120000, dealership.getTill(), .00);
    }




}
