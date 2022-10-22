package TA.HW03;

public class SuperLuxCar extends LuxCar {

    private Sound sound;

    public SuperLuxCar(int engine, String aircond) {
        super(engine, aircond);
        this.sound = new Sound();
    }

    public double getCost() {
        return super.getCost() + sound.getCost();
    }

    public double getPrice() {
        return (int) (getCost() * 1.2);
    }

    public boolean isExpensive(LuxCar car2) {
         return getPrice() > car2.getPrice();
    }
}
