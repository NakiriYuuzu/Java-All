package CSCETA.HW_04;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("The GCD of (%d, %d) is: %d\nThe LCM of (%d, %d) is: %d\n", x, y, gcd(x, y), x, y, lcm(x, y));
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        else
            return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
