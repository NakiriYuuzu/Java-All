package CPE_STAR_01;

import java.util.Scanner;
import java.util.TreeSet;

public class Jolly_Jumpers_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int cases = sc.nextInt();
            int[] numbers = new int[cases];

            for (int i = 0; i < cases; i++)
                numbers[i] = sc.nextInt();

            TreeSet<Integer> sets = new TreeSet<>();

            for (int i = 0; i <cases - 1; i++) {
                int value = Math.abs(numbers[i] - numbers[i + 1]);

                if (value >= 1 && value <= cases -1)
                    sets.add(value);
            }
            if (sets.size() == cases - 1)
                System.out.println("Jolly");
            else
                System.out.println("Not jolly");
        }
    }
}
