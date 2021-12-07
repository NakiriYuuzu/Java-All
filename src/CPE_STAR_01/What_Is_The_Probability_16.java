package CPE_STAR_01;

import java.util.Scanner;

public class What_Is_The_Probability_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int totalPlayer = sc.nextInt();
            double win = sc.nextDouble();
            int winnerNumber = sc.nextInt();

            double lose = 1 - win;
            double result = 0;

            for (int j = 0; j < 50; j++) {
                result += Math.pow(lose, j * totalPlayer + winnerNumber - 1) * win;
            }

            System.out.printf("%.4f%n", result);
        }
    }
}
