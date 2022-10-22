package FinalExam.Test_01;

import java.util.Scanner;

public class TreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print("PreOrder:");
        preOrder(0, str);
        System.out.print("\nInOrder:");
        inOrder(0, str);
        System.out.print("\nPostOrder:");
        postOrder(0, str);
    }

    static void preOrder(int n, String s) {
        if (n < s.length()) {
            System.out.print(s.charAt(n));
            preOrder(n * 2 + 1, s);
            preOrder(n * 2 + 2, s);
        }
    }

    static void inOrder(int n, String s) {
        if (n < s.length()) {
            inOrder(n * 2 + 1, s);
            System.out.print(s.charAt(n));
            inOrder(n * 2 + 2, s);
        }
    }

    static void postOrder(int n, String s) {
        if (n < s.length()) {
            postOrder(n * 2 + 1, s);
            postOrder(n * 2 + 2, s);
            System.out.print(s.charAt(n));
        }
    }
}
