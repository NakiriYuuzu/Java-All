package Data_Structure.Data.MidExam;

import java.util.Scanner;
import java.util.Stack;

public class AdvancedFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(')
                stack.push(i);

            else if (c == ')') {
                if (stack.isEmpty())
                    System.out.println("-1," + i);
                else
                    System.out.println(stack.pop() + "," + i);
            }
        }

        while (!stack.empty())
            System.out.println("-1, " + stack.pop());
    }
}
