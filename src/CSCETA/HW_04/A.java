package CSCETA.HW_04;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfAdd(sc.nextInt(), sc.nextInt()));
    }

    private static int sumOfAdd(int x, int y) {
        int[] arr = {x, y};
        int total = 0;

        Arrays.sort(arr);

        for (int i = arr[0]; i <= arr[1]; i++)
            if (i % 2 == 0)
                total += i;

        return total;
    }
}
