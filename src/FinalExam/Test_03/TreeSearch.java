package FinalExam.Test_03;

import java.util.Scanner;

public class TreeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), level, max = 0;
        int[] arr = new int[4096];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int j = 1;
            level = 1;

            while (arr[j] != 0) {
                level ++;
                if (a > arr[j])
                    j = j * 2 + 1;
                else
                    j = j * 2;
            }

            if (max < level)
                max = level;

            arr[j] = a;
        }

        int num = (int) Math.pow(2, max);
        System.out.println(max);

        for (int i = 0; i < num; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
