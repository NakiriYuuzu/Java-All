package CPE_STAR_01;

import java.util.ArrayList;
import java.util.Scanner;

public class UVA_948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> fibList = new ArrayList<>();
        fibList.add(1);
        fibList.add(2);

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean isZero = false;

            while (num > fibList.get(fibList.size() - 1))
                fibList.add(fibList.get(fibList.size() - 1) + fibList.get(fibList.size() - 2));

            for (int j = fibList.size() - 1; j >= 0; j--) {
                int fib = fibList.get(j);

                if (num >= fib) {
                    num = num - fib;
                    System.out.print(1);
                    isZero = true;

                } else if (isZero) {
                    System.out.print(0);
                }
            }
            System.out.println(" (fib)");
        }
    }
}