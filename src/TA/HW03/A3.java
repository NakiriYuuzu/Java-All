package TA.HW03;

public class A3 {
    public static void main(String[] args) {
        Engine eng1 = new Engine(1600);
        System.out.printf("1600cc Engine: %d%n", eng1.getCost());
        Engine eng2 = new Engine(2000);
        System.out.println("2000cc Engine: " + eng2.getCost());

        Aircond airc1 = new Aircond("auto");
        System.out.println("Auto Aircond: " + airc1.getCost());
        Aircond airc2 = new Aircond("manual");
        System.out.println("Manual Aircond: " + airc2.getCost());

        Sound snd1 = new Sound();
        System.out.println("Sound: " + snd1.getCost());
    }
}
