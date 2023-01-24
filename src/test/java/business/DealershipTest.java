package business;

import org.junit.Before;
import org.junit.Test;
import vehicle.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealershipTest {
    ArrayList<Car> dealershipsCars;
    Dealership dealership;
    Car car;
    Engine engine;
    Door door;
    Tyre tyre;
    ArrayList<Tyre> listOfTyres;
    ArrayList<Door> listOfDoors;


    @Before
    public void before(){
        dealershipsCars = new ArrayList<Car>();
        dealership = new Dealership(2000, dealershipsCars);
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
        dealership.addCarToDealership(car);
    }

    @Test
    public void getTill() {
        assertEquals(2000, dealership.getTill(),0.0);
    }

    @Test
    public void setTill() {
        dealership.setTill(3000);
        assertEquals(3000, dealership.getTill(),0.0);
    }

    @Test
    public void getDealershipsCars() {
        assertEquals(1, dealership.getDealershipsCars().size());
    }

    @Test
    public void canAddCarToDealership() {
        dealership.addCarToDealership(car);
        assertEquals(2, dealership.getDealershipsCars().size());
    }

}