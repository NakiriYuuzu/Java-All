package Data_Structure.Data.MidExam;

import java.util.Scanner;
import java.util.Stack;

public class Pre_To_Post {
    static boolean isOperator(char c) {
        return switch (c) {
            case '+', '-', '/', '*' -> true;
            default -> false;
        };
    }

    static String preToPost(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<String> stack = new Stack<>();

        str.reverse();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isOperator(c)) {
                String a = stack.peek();
                stack.pop();
                String b = stack.peek();
                stack.pop();
                String temp = a + b + c;

                stack.push(temp);
            }
            else
                stack.push(c + "");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(preToPost(sc.nextLine()));
    }
}
