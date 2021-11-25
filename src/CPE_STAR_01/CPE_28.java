package CPE_STAR_01;

import java.util.Scanner;

public class CPE_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt(), count = 0;

            if (n == 0)
                break;

            StringBuilder str = new StringBuilder();
            while (n > 0) {
                int result = n % 2;
                str.append(result);

                if (n == 1)
                    count++;

                n /= 2;
            }
            str.reverse();
            System.out.println("The parity of " + str + " is " + count + " (mod2).");
        }
    }
}