package TA.HW03;

import java.util.ArrayList;

public class Warehouse {

    ArrayList<Car> cars;
    private final int capacity;

    public Warehouse(int capacity) {
        this.capacity = capacity;
        cars = new ArrayList<>();
    }

    public void addCar(Car newCar) {
        cars.add(newCar);
    }

    public int getCapacity() {
        return capacity - cars.size();
    }
    public int getTotalCost() {
        int cost = 0;
        for (Car car : cars)
            cost += car.getCost();
        return cost;
    }
    public int getTotalPrice() {
        int price = 0;
        for (Car car : cars)
            price += car.getPrice();
        return price;
    }
}
