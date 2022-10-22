package TA.HW03;

public class LuxCar extends Car {

    private Engine eng;
    private Aircond aircond;

    public LuxCar(int engine, String aircond) {
        this.eng = new Engine(engine);
        this.aircond = new Aircond(aircond);
    }

    public double getCost() {
        return eng.getCost() + aircond.getCost() + 10000;
    }

    public double getPrice() {
        return (int) (getCost() * 1.2);
    }
}
