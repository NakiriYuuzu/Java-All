package Data_Structure.Data.MidExam;

import java.util.Scanner;
import java.util.Stack;

public class In_to_Post {

    static int order(char c) {
        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else
            return -1;
    }

    static String in_to_post(String s) {
        StringBuilder str = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c))
                str.append(c);

            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    str.append(stack.pop());

                stack.pop();
            }

            else {
                while (!stack.isEmpty() && order(c) <= order(stack.peek()))
                    str.append(stack.pop());

                stack.push(c);
            }
        }

        while (!stack.isEmpty())
            str.append(stack.pop());

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(in_to_post(sc.nextLine()));
    }
}
