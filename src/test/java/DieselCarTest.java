import org.example.car.Car;
import org.example.car.DieselCar;
import org.example.car.Gear;
import org.example.car.Weather;
import org.example.carparts.Engine;
import org.example.carparts.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    private DieselCar car;
    private Engine engine;
    private Tyre tyre;

    @Before
    public void setUp(){
        engine = new Engine("Leman", "1234556789", 1900);
        tyre = new Tyre("Mechellin", 19, Weather.SNOW);
        car = new DieselCar("Audi", "2020", "Blue", "Sport", engine, Gear.MANUAL, tyre, 20000);
    }
    @Test
    public void hasBrand(){
        assertEquals("Audi", car.getBrand());
    }
    @Test
    public void hasModel(){
        assertEquals("2020", car.getModel());
    }
    @Test
    public void hasColour(){
        assertEquals("Blue", car.getColour());
    }
    @Test
    public void hasType(){
        assertEquals("Sport", car.getType());
    }
    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }
    @Test
    public void hasEngineSize(){
        assertEquals("1900.0 cc", car.getEngine().getSizeAsString());
    }
    @Test
    public void hasGear(){
        assertEquals("Manual", car.getGear());
    }
    @Test
    public void hasTyre(){
        assertEquals(tyre, car.getTyre());
    }
    @Test
    public void hasTyreSize(){
        assertEquals("19.0 inches", car.getTyreSizeAsString());
    }
    @Test
    public void hasPrice(){
        assertEquals(20000, car.getPrice(), .00);
    }
    @Test
    public void hasFuel(){
        assertEquals("Diesel", car.getFuel());
    }
    @Test
    public void canMove(){
        assertEquals("I can move with Diesel", car.move());
    }
}
