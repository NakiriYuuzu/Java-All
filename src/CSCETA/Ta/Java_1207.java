package CSCETA.Ta;

import java.util.Scanner;

public class Java_1207 {
    static void findDuplicate(int[] n) {
        int[] num = new int[101];
        int[] count = new int[num.length];
        int[] store = new int[num.length];
        boolean checked = true;

        for (int i = 0; i < 101; i++)
            num[i] = i;

        for (int i = 0; i < num.length; i++)
            for (int k : n)
                if (k == num[i])
                    count[i]++;

        for (int i = 0; i < count.length; i++)
            if (count[i] >= 2)
                store[i] = num[i];

        System.out.println("重複值\t重複次數");

        for (int i = 0; i < store.length; i++) {
            if (store[i] >= 1) {
                checked = false;
                System.out.println(store[i] + "\t\t" + count[i]);
            }
        }

        if (checked)
            System.out.print("-1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        findDuplicate(arr);
    }
}
