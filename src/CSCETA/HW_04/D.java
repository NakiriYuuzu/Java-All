package CSCETA.HW_04;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt()};
        int total = 0, a = arr[0], b = arr[1];

        Arrays.sort(arr);

        for (int i = arr[0]; i <= arr[1]; i++) {
            if (checkYear(i))
                total ++;
        }
        System.out.println("Number of leap years between "  + a + " and " + b + " is "+ total);
    }

    private static boolean checkYear(int n) {
        if (n % 400 == 0)
            return true;
        else if (n % 100 == 0)
            return false;
        else return n % 4 == 0;
    }
}
