package TA.MidExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warehouse wh = new Warehouse(100);

        while (sc.hasNextLine()) {
            String[] carInfo = sc.nextLine().split(" ");

            if (carInfo.length == 0) continue;
            char model = (carInfo[0].length() == 0) ? 'X' : carInfo[0].charAt(0);

            if (model == 'X') break;
            int cc = Integer.parseInt(carInfo[1]);

            switch (model) {
                case 'B' -> wh.addCar(new BasicCar(cc));
                case 'L' -> wh.addCar(new LuxCar(cc, carInfo[2], Integer.parseInt(carInfo[3])));
            }
        }
        System.out.println("Total cost: " + wh.getTotalCost());
        System.out.println("Total price: " + wh.getTotalPrice());
        System.out.println("Available capacity: " + wh.getCapacity());
    }
}

class Warehouse {
    private int size;
    private ArrayList<Car> cars;

    public Warehouse(int size) {
        this.size = size;
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
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

    public int getCapacity() {
        return size - cars.size();
    }
}

abstract class Car {
    protected int engineCC;
    protected double assembleCost;

    public abstract int getCost();

    public abstract int getPrice();
}

class BasicCar extends Car {

    public BasicCar(int cc) {
        engineCC = cc;
        assembleCost = 150000;
    }

    @Override
    public int getCost() {
        int cost = (int) assembleCost;
        switch (engineCC) {
            case 1600 -> cost += 300000;
            case 2000 -> cost += 450000;
        }
        return cost;
    }

    @Override
    public int getPrice() {
        return (int) (getCost() * 1.2);
    }
}

class LuxCar extends Car {
    private String airCondType;
    private double soundCost;

    public LuxCar(int cc, String airCondType, double soundCost) {
        engineCC = cc;
        assembleCost = 200000;
        this.airCondType = airCondType;
        this.soundCost = soundCost;
    }

    @Override
    public int getCost() {
        int cost = (int) assembleCost;

        if (airCondType.equals("auto"))
            cost += 100000;
        else
            cost += 80000;

        if (engineCC == 1600)
            cost += 300000;
        else
            cost += 450000;

        cost += soundCost;

        return cost;
    }

    @Override
    public int getPrice() {
        return (int) (getCost() * 1.2);
    }
}