package Data_Structure.Data.MidExamFinal;

import java.util.Scanner;

public class Test1 {
	
	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		else {
			return gcd(b % a, a);
		}
	}
	
	static int calc(int[] arr) {
		int result = 0;
		for (int i : arr) {
			result = gcd(result, i);
		}
		if (result == 0) {
			return 0;
		} else {
			return result;
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(calc(arr));
	}

}
