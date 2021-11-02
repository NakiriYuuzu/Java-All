package CSCETA.HW_03;

import java.util.Scanner;

public class E {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0)
            if (n == 1)
                System.out.println("None");
            else {
                System.out.print(2);

                for (int i = 3; i <= n; i++)
                    if (isPrimer(i))
                        System.out.print(","+ i);

                System.out.println();
            }
        else
            System.out.println("Wrong Input");
    }

    public static boolean isPrimer(int n) {
        int cc = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cc++;
            }
        }
        return cc == 2;
    }
}
