package vehicle;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CarTest {

    Car car;
    Engine engine;
    Door door;
    Tyre tyre;
    ArrayList<Tyre> listOfTyres;
    ArrayList<Door> listOfDoors;

    @Before
    public void setUp() throws Exception {
        door = new Door();
        tyre = new Tyre();
        listOfTyres = new ArrayList<Tyre>();
        listOfDoors= new ArrayList<Door>();
        engine = new Engine(120);
        car = new Car(engine, CarType.PETROL, listOfTyres, listOfDoors,1000);
        car.addDoor(door);
        car.addDoor(door);
        car.addDoor(door);
        car.addTyre(tyre);
        car.addTyre(tyre);
        car.addTyre(tyre);
        car.addTyre(tyre);
    }

    @Test
    public void getEngine() {
        assertNotNull( car.getEngine());
    }

    @Test
    public void getCarType() {
        assertEquals(CarType.PETROL, car.getCarType());
    }

    @Test
    public void getListOfTyres() {
        assertEquals(4, car.getListOfTyres().size());
    }

    @Test
    public void getListOfDoors() {
        assertEquals(3, car.getListOfDoors().size());
    }

    @Test
    public void carCanAddTyre(){
        car.addTyre(tyre);
        assertEquals(5, car.getListOfTyres().size());
    }

    @Test
    public void carCanAddDoor(){
        car.addDoor(door);
        assertEquals(4, car.getListOfDoors().size());
    }

    @Test
    public void canGetPrice() {
        assertEquals(1000, car.getPrice(),0.0);
    }

    @Test
    public void canSetPrice() {
        car.setPrice(1500);
        assertEquals(1500, car.getPrice(),0.0);
    }
}