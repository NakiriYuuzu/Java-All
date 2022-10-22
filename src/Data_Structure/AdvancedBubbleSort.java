package Data_Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedBubbleSort {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        String[] str = sc.nextLine().split("\\s+");

        for (String s : str) {
            num.add(Integer.parseInt(s));
            System.out.print(s + " ");
        }

        System.out.println();
        bubbleSort(num, num.size());
        printBubbleSort(num);
        System.out.println();
        System.out.println("次數" + count);
    }

    public static void bubbleSort(ArrayList<Integer> a, int n) {
        int temp, num;

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                temp = a.get(j);
                num = a.get(j + 1);

                if (a.get(j) > a.get(j + 1)) {
                    a.set(j, num);
                    a.set(j + 1, temp);
                    count++;
                }
            }
        }
    }

    public static void printBubbleSort(ArrayList<Integer> a) {
        System.out.println("排序10個亂數值: ");
        for (int x : a)
            System.out.print(x + " ");

        System.out.println("次數" + count);
    }
}
