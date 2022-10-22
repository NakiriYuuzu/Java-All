package FinalExam.Test_01;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * 90) + 10;

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        int find = search(arr, sc.nextInt());
        System.out.println(find);
    }

    static int search(int[] num, int des) {
        int low = 0;
        int high = num.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (num[mid] < des)
                low = mid + 1;
            else if (num[mid] > des)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int p = arr[low], i = low, j = high;

        while (i < j) {
            while (arr[j] >= p && i < j)
                j--;
            while (arr[i] <= p && i < j)
                i++;

            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        arr[low] = arr[i];
        arr[i] = p;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
}
