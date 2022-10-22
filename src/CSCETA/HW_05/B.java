package CSCETA.HW_05;

import java.util.*;

public class B {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        NavigableMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        int n = sc.nextInt(), total = 0;

        while (n != 0) {
            if (n > 49) {
                map.put(50, n / 50);
                total += n / 50;
                n = n % 50;
            } else if (n > 9) {
                map.put(10, n / 10);
                total += n / 10;
                n = n % 10;
            } else if (n > 4) {
                map.put(5, n / 5);
                total += n / 5;
                n = n % 5;
            } else {
                map.put(1, n);
                total += n;
                n = 0;
            }
        }

        Map.Entry<Integer, Integer> lastEntry = map.lastEntry();
        map.remove(lastEntry.getKey(), lastEntry.getValue());

        System.out.print("Give: ");
        map.forEach((key, value) -> System.out.print(key + "*" + value + ", "));
        System.out.print(lastEntry.getKey() + "*" + lastEntry.getValue());
        System.out.println("\nTotal: " + total + " coins");
    }
}