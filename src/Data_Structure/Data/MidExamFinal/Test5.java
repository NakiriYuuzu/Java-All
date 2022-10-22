package Data_Structure.Data.MidExamFinal;

import java.util.Scanner;
import java.util.Stack;

public class Test5 {
	static int isOP(char c) {
		if (c == '-' || c == '+')
			return 1;
		else if (c == '*' || c == '/')
			return 2;
		else
			return -1;
	}
	
	static String clean(String s) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				result.append(c);
		}
		
		return result.toString();
	}
	
	static String outSpace(String s) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i == s.length() - 1)
				result.append(c);
			else
				result.append(c + " ");
		}
		return result.toString();
	}
	
	static String inPre(String s) {
		StringBuilder str = new StringBuilder(s).reverse();
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				result.append(c);
			}
			
			else if (c == ')') {
				stack.push(c);
			}
			
			else if (c == '(') {
				while (!stack.isEmpty() && stack.peek() != ')') {
					result.append(stack.pop());
				}
				
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}
			
			else {
				while (!stack.isEmpty() && isOP(c) < isOP(stack.peek())) {
					result.append(stack.pop());
				}
				
				stack.push(c);
			}
		}
		
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		
		return result.reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(outSpace(inPre(clean(sc.nextLine()))));
	}
}
