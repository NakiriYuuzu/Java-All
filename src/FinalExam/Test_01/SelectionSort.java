package FinalExam.Test_01;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * 90) + 10;

        selectionSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    private static void selectionSort(int[] arr) {
        if (arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;

            for (int j = i; j < arr.length; j++)
                if (arr[j] < arr[smallest])
                    smallest = j;

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
