package FinalExam.Test_02;

import java.util.Scanner;

public class TreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        preOrder(0, s);
        System.out.println();
        inOrder(0, s);
        System.out.println();
        postOrder(0, s);
    }

    private static void preOrder(int n, String str) {
        if (n < str.length()) {
            System.out.print(str.charAt(n));
            preOrder(n * 2 + 1, str);
            preOrder(n * 2 + 2, str);
        }
    }

    private static void inOrder(int n, String str) {
        if (n < str.length()) {
            inOrder(n * 2 + 1, str);
            System.out.print(str.charAt(n));
            inOrder(n * 2 + 2, str);
        }
    }

    private static void postOrder(int n, String str) {
        if (n < str.length()) {
            postOrder(n * 2 + 1, str);
            postOrder(n * 2 + 2, str);
            System.out.print(str.charAt(n));
        }
    }
}
