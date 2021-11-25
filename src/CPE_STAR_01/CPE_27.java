package CPE_STAR_01;

import java.util.Scanner;

public class CPE_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            String base2 = Integer.toString(num, 2);

            int base16 = Integer.parseInt(base2, 16);

            String returnBase2 = Integer.toString(base16, 2);

            long b1 = base2.chars().filter(c -> c == '1').count();
            long b2 = returnBase2.chars().filter(c -> c == '1').count();

            System.out.println(b1 + " " + b2);
        }
    }
}
