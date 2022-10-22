package TA.HW03;

public class Engine {

    private int cc;
    private int cost;

    public Engine(int cc) {
        this.cc = cc;
        cost = (cc == 1600)? 20000 : 25000;
    }

    public int getCost() {
        return cost;
    }
}
