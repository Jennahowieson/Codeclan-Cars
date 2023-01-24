package business;

import behaviours.IBuy;
import behaviours.ISell;
import vehicle.Car;

import java.util.ArrayList;

public class Customer implements IBuy, ISell {
    double money;
    ArrayList<Car> customersCars;

    public Customer(double money, ArrayList<Car> customersCars) {
        this.money = money;
        this.customersCars = customersCars;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Car> getCustomersCars() {
        return customersCars;
    }

    public void addCarToCustomer(Car car){
        getCustomersCars().add(car);
    }

    public Car removeCarFromCustomer(Car car){
        getCustomersCars().remove(car);
        return car;
    }

    public void buy(Car car) {
        if (this.money >= car.getPrice()){
            addCarToCustomer(car);
            this.money =-car.getPrice();
        }
    }

    public void sell(Car car) {
        removeCarFromCustomer(car);
        this.money += car.getPrice();
    }

}
