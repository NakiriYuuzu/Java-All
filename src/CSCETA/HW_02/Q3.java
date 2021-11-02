package CSCETA.HW_02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 30)
            System.out.println("Free");
        else
            System.out.printf("NT$: %d", (n / 30) * 20);
    }
}
