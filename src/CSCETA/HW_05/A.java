package CSCETA.HW_05;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() < 2)
            System.out.println("Wrong Data");
        else
            if (checkedSymm(str))
                System.out.println("Symmetry");
            else
                System.out.println("Not Symmetry");
    }

    static boolean checkedSymm(String str) {
        boolean checked = false;
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            int x = (c.length - 1) - i;
            if (c[i] == c[x])
                checked = true;
            else {
                checked = false;
                break;
            }
        }

        return checked;
    }
}
