package FinalExam.Test_03;

import java.util.Scanner;

public class TreeLeaf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), inner = 0, leaf = 0;
        int[] arr = new int[n * 2];

        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * 90) + 10;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                if (arr[i * 2] != 0 || arr[i * 2 + 1] != 0)
                    inner++;
                else
                    leaf ++;
        }
        System.out.println(inner);
        System.out.println(leaf);
    }
}
