package All_Fix;

import java.util.Scanner;
import java.util.Stack;

public class Prefix_To_Infix {
    static boolean isOperator(char x) {
        return switch (x) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }

    // Convert prefix to Infix expression
    public static String convert(String str) {
        Stack<String> stack = new Stack<>();

        // Length of expression
        int l = str.length();

        // Reading from right to left
        for (int i = l - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Concat the operands and operator
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            } else {

                // To make character to string
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String exp = "*-A/BC-/AKL";
        String exp = sc.nextLine();
        System.out.println("Infix : " + convert(exp));
    }
}
