package CSCETA.HW_04;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2)
            System.out.println(n + " : Wrong Input");
        else
            isPrimer(n);
    }

    private static void isPrimer(int n) {
        System.out.print(n + " = ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && n != i) {
                n /= i;
                System.out.print(i + "*");
            }
            if (n == i) {
                System.out.print(i);
                break;
            }
        }
    }
}
