package TA.HW03;

public class B3 {
    public static void main(String[] args) {
        BasicCar bc = new BasicCar(1600,"manual");
        System.out.printf("Basic car cost: %.0f%n", bc.getCost());
        System.out.printf("Basic car price: %.0f%n", bc.getPrice());

        LuxCar luxc = new LuxCar(2000,"auto");
        System.out.printf("Lux car cost: %.0f%n", luxc.getCost());
        System.out.printf("Lux car price: %.0f%n", luxc.getPrice());
    }
}
