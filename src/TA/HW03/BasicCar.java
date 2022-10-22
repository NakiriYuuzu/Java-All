package TA.HW03;

public class BasicCar extends Car {

    private Engine eng;
    private Aircond aircond;

    public BasicCar(int engine, String aircond) {
        this.eng = new Engine(engine);
        this.aircond = new Aircond(aircond);
    }

    public double getCost() {
        return eng.getCost() + aircond.getCost() + 5000;
    }

    public double getPrice() {
        return (int) ((eng.getCost() + aircond.getCost() + 5000) * 1.2);
    }
}
