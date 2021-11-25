package Data.MidExam;

import java.util.Scanner;
import java.util.Stack;

public class Post_To_Pre {
    static boolean isOP(char c) {
        return switch(c) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }

    static String postPre(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder str = new StringBuilder(s).reverse();

        for (int i = 0; i < str.length(); i++) {
            char c = s.charAt(i);
            if (isOP(c)) {
                String a = stack.pop();
                String b = stack.pop();
                String temp = c + b + a;
                stack.push(temp);
            }
            else {
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(postPre(sc.nextLine()));
    }
}
