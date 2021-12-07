package Data.MidExamFinal;

import java.util.Scanner;

public class Test2 {
	
	static int count = 0;
	
	static int fib(int n) {
		if (n == 0) {
			count++;
			return 0;
		}
		else if (n == 1) {
			count++;
			return 1;
		}
		else {
			count++;
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0 && n <= 20) {
			System.out.println(fib(n));
			System.out.println(count);
		}
	}
}
