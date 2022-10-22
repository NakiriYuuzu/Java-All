package FinalExam.Test_01;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * 90) + 10;

        System.out.println("Before: " + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        if (arr.length == 0)
            return;

        int current;
        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex --;
            }

            arr[preIndex + 1] = current;
        }
    }
}
