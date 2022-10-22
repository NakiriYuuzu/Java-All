package CSCETA.HW_05;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() / 10;
            if (x == 10)
                x -= 1;
            arr[x]++;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (i == arr.length - 1)
                System.out.printf("%3d~%2d:%s%n", 100, 90, printStar(arr[i]));
            else
                System.out.printf("%3d~%2d:%s%n", i * 10 - 1, (i - 1) * 10, printStar(arr[i]));
        }
    }

    public static String printStar(int n) {
        return "*".repeat(n);
    }
}
