package CPE_STAR_01;

import java.util.Scanner;

public class CPE_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char[] ascii = new char[36];
        int[] ink = new int[36];

        for (int i = 0; i < 36; i++) {
            if (i < 10)
                ascii[i] = (char) (i + 48);
            else
                ascii[i] = (char) (i + 55);
        }

        int times = sc.nextInt();
        while (times-- > 0) {
            count++;
            System.out.println("Case " + count + ":");

            for (int i = 0; i < ink.length; i++)
                ink[i] = sc.nextInt();

            int n = sc.nextInt();

            while (n-- > 0) {

            }
        }
    }
}
