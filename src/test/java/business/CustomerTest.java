package business;

import org.junit.Before;
import org.junit.Test;
import vehicle.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CustomerTest {
    ArrayList<Car> customersCars;
    Customer customer;
    Car car;
    Engine engine;
    Door door;
    Tyre tyre;
    ArrayList<Tyre> listOfTyres;
    ArrayList<Door> listOfDoors;


    @Before
    public void before(){
        customersCars = new ArrayList<Car>();
        customer = new Customer(2000, customersCars);
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
        customer.addCarToCustomer(car);
    }

    @Test
    public void getMoney() {
        assertEquals(2000, customer.getMoney(),0.0);
    }

    @Test
    public void setMoney() {
        customer.setMoney(3000);
        assertEquals(3000, customer.getMoney(),0.0);
    }

    @Test
    public void getCustomersCars() {
        assertEquals(1, customer.getCustomersCars().size());
    }

    @Test
    public void canAddCarToCustomer() {
        customer.addCarToCustomer(car);
        assertEquals(2, customer.getCustomersCars().size());
    }


}