package CSCETA.HW_03;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0)
            System.out.println(checkYear(n));
        else
            System.out.println(n + ": Wrong Input");

    }

    private static String checkYear(int n) {
        if (n % 400 == 0)
            return n + ": Yes";
        else if (n % 100 == 0)
            return n + ": No";
        else if (n % 4 == 0)
            return n + ": Yes";
        else
            return n + ": No";
    }
}
