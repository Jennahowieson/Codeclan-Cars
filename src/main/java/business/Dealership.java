package business;

import behaviours.IBuy;
import behaviours.ISell;
import vehicle.Car;

import java.util.ArrayList;

public class Dealership implements IBuy, ISell {
    double till;
    ArrayList<Car> dealershipCars;


    public Dealership(double till, ArrayList<Car> dealershipCars) {
        this.till = till;
        this.dealershipCars = dealershipCars;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Car> getDealershipsCars() {
        return dealershipCars;
    }

    public void addCarToDealership(Car car){
        getDealershipsCars().add(car);
    }

    public void buy(Car car, Customer customer) {
        if (this.till >= car.getPrice()) {
            addCarToDealership(car);
            this.till =- car.getPrice();
            customer.sell(car);
        }
    }

    public Car removeCarFromDealership(Car car){
        getDealershipsCars().remove(car);
        return car;
    }

    public void sell(Car car) {
            removeCarFromDealership(car);
        this.till += car.getPrice();
    }

}