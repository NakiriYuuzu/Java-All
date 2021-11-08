package CSCETA.HW_02;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 999999 && n < 10000000)
            if (isPalindrome(String.valueOf(n)))
                System.out.printf("%d: Symm7%n", n);
            else
                System.out.printf("%d: NotSymm7%n", n);
        else
            System.out.printf("%d: Wrong Input%n", n);
    }

    static boolean isPalRec(String str, int s, int e) {
        if (s == e)
            return true;

        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean isPalindrome(String str) {
        int n = str.length();

        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }
}