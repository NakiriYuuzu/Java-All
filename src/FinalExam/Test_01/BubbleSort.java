package FinalExam.Test_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String[] str = sc.nextLine().split("\\s");

        for (String s : str)
            list.add(Integer.parseInt(s));

        System.out.println("Before: " + list);
        bubbleSort(list);
        System.out.println("After: " + list);
        System.out.println("Count: " + count);
    }

    static void bubbleSort(List<Integer> list) {
        int temp, n;
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                temp = list.get(j);
                n = list.get(j + 1);

                if (list.get(j) > list.get(j + 1)) {
                    list.set(j, n);
                    list.set(j + 1, temp);
                    count++;
                }
            }
        }
    }
}
