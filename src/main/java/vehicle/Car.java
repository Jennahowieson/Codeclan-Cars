package vehicle;

import java.util.ArrayList;

public class Car {
    Engine engine;
    CarType carType;
    ArrayList<Tyre> listOfTyres;
    ArrayList<Door> listOfDoors;
    double price;


    public Car(Engine engine, CarType carType, ArrayList<Tyre> listOfTyres, ArrayList<Door> listOfDoors, double price) {
        this.engine = engine;
        this.carType = carType;
        this.listOfTyres = listOfTyres;
        this.listOfDoors =listOfDoors;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public ArrayList<Tyre> getListOfTyres() {
        return listOfTyres;
    }

    public ArrayList<Door> getListOfDoors() {
        return listOfDoors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addDoor(Door door){
        this.listOfDoors.add(door);
    }

    public void addTyre(Tyre tyre){
        this.listOfTyres.add(tyre);
    }
}
