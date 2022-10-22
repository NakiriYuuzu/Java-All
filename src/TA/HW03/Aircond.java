package TA.HW03;

public class Aircond {

    private int cost;

    public Aircond() {

    }

    public Aircond(String auto) {
        if (auto.equals("auto"))
            cost = 12000;
        else
            cost = 10000;
    }

    public int getCost() {
        return cost;
    }
}
