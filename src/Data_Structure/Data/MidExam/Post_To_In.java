package Data_Structure.Data.MidExam;

import java.util.Scanner;
import java.util.Stack;

public class Post_To_In {
    static String postIn(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c))
                stack.push(c + "");

            else {
                String a = stack.pop();
                String b = stack.pop();
                String temp = "(" + b + c + a + ")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(postIn(sc.nextLine()));
    }
}
