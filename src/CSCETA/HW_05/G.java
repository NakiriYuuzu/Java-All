package CSCETA.HW_05;

import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), count = 0;

            if (x == 6174) {
                System.out.println(0);
                continue;
            }

            if (checkSame(x)) {
                System.out.println(9);
                continue;
            }

            do {
                List<Integer> list = toDigit(x);
                Collections.sort(list);
                int min = getValue(list);
                Collections.reverse(list);
                int max = getValue(list);

                x = max - min;
                count++;
            } while (x != 6174);

            System.out.println(count);
        }
    }

    public static List<Integer> toDigit(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n / 1000 % 10);
        list.add(n / 100 % 10);
        list.add(n / 10 % 10);
        list.add(n % 10);

        return list;
    }

    public static int getValue(List<Integer> n) {
        StringBuilder a = new StringBuilder();
        for (Integer integer : n)
            a.append(integer);

        return Integer.parseInt(String.valueOf(a));
    }

    public static boolean checkSame(int n) {
        List<Integer> list = toDigit(n);
        if (Objects.equals(list.get(0), list.get(1)))
            return Objects.equals(list.get(1), list.get(2));
        else
            return false;
    }
}