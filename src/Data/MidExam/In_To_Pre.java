package Data.MidExam;

import java.util.Scanner;
import java.util.Stack;

public class In_To_Pre {
    static int order(char c) {
        if (c == '-' || c == '+')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else
            return -1;
    }

    static String in_Pre(String s) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        str.reverse();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetterOrDigit(c))
                result.append(c);
            else if (c == ')')
                stack.push(c);
            else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')')
                    result.append(stack.pop());
                stack.pop();
            }else {
                while (!stack.isEmpty() && order(c) <= order(stack.peek()))
                    result.append(stack.pop());
                stack.push(c);
            }
        }

        while (!stack.isEmpty())
            result.append(stack.pop());

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(in_Pre(sc.nextLine()));
    }
}
