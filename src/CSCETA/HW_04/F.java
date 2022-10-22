package CSCETA.HW_04;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sum = new int[10];
        int max = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == -1)
                break;

            if (n > 0 && n < 11)
                for (int i = 0; i < arr.length; i++) {
                    if (n == arr[i])
                        sum[i]++;
                    if (max < sum[i])
                        max = sum[i];
                }
        }

        System.out.printf("{#1:%d},{#2:%d},{#3:%d},{#4:%d},{#5:%d},{#6:%d},{#7:%d},{#8:%d},{#9:%d},{#10:%d}\n", sum[0], sum[1], sum[2], sum[3], sum[4], sum[5], sum[6], sum[7], sum[8], sum[9]);

        for (int i = 0; i < 10; i++)
            if (sum[i] == max) {
                System.out.println("The highest candidate id: " + arr[i]);
                break;
            }
    }
}
