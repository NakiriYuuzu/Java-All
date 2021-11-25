package CSCETA.HW_03;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0 || n > 15)
			System.out.println(n + " : Wrong Input");
		else
			System.out.println(n + "! = " + n(n));
    }
	public static int n(int n) {
		if (n == 1)
			return 1;
		else
			return n * n(n - 1);
	}
}
