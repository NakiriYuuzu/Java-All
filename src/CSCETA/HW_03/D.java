package CSCETA.HW_03;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0)
            if (n == 1)
                System.out.println(n + ": NONE");
            else
                if (primeCtr(n))
                    System.out.println(n + ": Prime");
                else
                    System.out.println(n + ": Composite");
        else
            System.out.println(n + ": Wrong Input");
    }

    private static boolean primeCtr(int n) {
        boolean isPrime = true;
        int ctr = 2;

        while (ctr < n) {
            if (n % ctr == 0) {
                isPrime = false;
                break;
            }
            ctr++;
        }
        return isPrime;
    }
}
