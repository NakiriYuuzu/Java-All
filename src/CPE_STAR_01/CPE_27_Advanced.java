package CPE_STAR_01;

import java.util.Scanner;

public class CPE_27_Advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            int n = sc.nextInt();
            int b1 = base2(n);
            int b2 = base2(base10(n));

            System.out.println(b1 + " " + b2);
        }
    }

    private static int base10(int n) {
        int power = 0;
        int hex = 0;
        while (n > 0) {
            int perNumber = n % 10;
            int result = perNumber * (int) Math.pow(16, power);
            hex += result;
            n /= 10;
            power++;
        }
        return hex;
    }

    private static int base2(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1)
                count++;

            n /= 2;
        }
        return count;
    }
}
