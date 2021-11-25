package TA;

import java.util.Scanner;

public class Q1_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sum = "";
        for (int i = 1; i <= n; i++) {
            sum += "*";
            System.out.printf("%s%n", sum);
        }
    }
}
