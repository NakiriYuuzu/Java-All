package Data_Structure.Data.MidExamFinal;

import java.util.Scanner;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == '(') {
				stack.push(i);
			}
			else if (c == ')') {
				System.out.println(stack.pop() + "," + i);
			}
		}
		
		while (!stack.isEmpty())
			System.out.println(stack.pop() +", -1");
	}

}
