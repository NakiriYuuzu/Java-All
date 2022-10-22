package TA.HW03;

import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warehouse wh = new Warehouse(100);

        while (sc.hasNextLine()) {
            String[] carInfo = sc.nextLine().split(" ");

            if(carInfo.length == 0) continue;

            char model = (carInfo[0].length( ) == 0) ? 'X' : carInfo[0].charAt(0);

            if (model == 'X') break;

            int cc = Integer.parseInt(carInfo[1]);
            String aircond = carInfo[2];

            switch (model) {
                case 'B' -> wh.addCar(new BasicCar(cc, aircond));
                case 'L' -> wh.addCar(new LuxCar(cc, aircond));
                case 'S' -> wh.addCar(new SuperLuxCar(cc, aircond));
            }

        }
        System.out.println("Total cost: " + wh.getTotalCost());
        System.out.println("Total price: " + wh.getTotalPrice());
        System.out.println("Available capacity: " + wh.getCapacity());
    }
}
