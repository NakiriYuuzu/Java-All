package TA.HW03;

public class C3 {
    public static void main(String[] args) {
        SuperLuxCar car1 = new SuperLuxCar(2000,"auto");
        System.out.printf("Car1 cost: %.0f%n", car1.getCost());
        System.out.printf("Car1 price: %.0f%n", car1.getPrice());
        LuxCar car2 = new LuxCar(2000,"auto");
        System.out.printf("Car2 cost: %.0f%n", car2.getCost());
        System.out.printf("Car2 price: %.0f%n", car2.getPrice());
        System.out.println("Is Car1 more expensive than Car2: " + car1.isExpensive(car2));
    }
}
