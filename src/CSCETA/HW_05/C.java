package CSCETA.HW_05;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat(),sum = 4;

        for (float i = 1;i <= n;i++) {
            if (i % 2 != 0) {
                sum -= 4 / (1 + i*2);
            }
            else {
                sum += 4 / (1 + i*2);
            }
        }
        System.out.printf("%.6f",sum);
    }
}
