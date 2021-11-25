package Data.MidExam;

import java.util.Scanner;

public class N {
    static int n(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * n(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(n(sc.nextInt()));
    }
}
