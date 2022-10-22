package CSCETA.HW_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();

        int n = sc.nextInt(), total = 0, pass = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            data.add(num);
            total += num;
            if (num >= 60)
                pass++;
        }

        solve(data, total, pass);
    }

    private static void solve(ArrayList<Integer> data, int total, int pass) {
        Collections.sort(data);
        int max = data.get(data.size() - 1);
        int min = data.get(0);
        double passRate = (double) 100 / data.size();

        System.out.printf("Max: %d, Min: %d, AVG: %.2f\nPass rate: %.1f%%\n", max, min, (float) total / data.size(), passRate * pass);
    }
}
