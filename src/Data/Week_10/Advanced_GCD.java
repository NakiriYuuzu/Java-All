package Data.Week_10;

import java.util.Scanner;

public class Advanced_GCD {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(gcd(sc.nextInt(), sc.nextInt()));
    }
}

