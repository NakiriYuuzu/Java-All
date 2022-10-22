package Data_Structure.Data.MidExam;

import java.util.Scanner;
import java.util.Stack;

public class Pre_To_In {
    static boolean isOP(char c) {
        return switch (c) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }

    static String preIn(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder str = new StringBuilder(s).reverse();

        for (int i = 0; i < s.length(); i++) {
            char c = str.charAt(i);
            if (isOP(c)) {
                String a = stack.pop();
                String b = stack.pop();

                String temp = "(" + a + c + b + ")";
                stack.push(temp);
            }
            else
                stack.push(c + "");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(preIn(sc.nextLine()));
    }
}
