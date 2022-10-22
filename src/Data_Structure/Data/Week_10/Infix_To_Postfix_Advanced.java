package Data_Structure.Data.Week_10;

import java.util.Scanner;
import java.util.Stack;

public class Infix_To_Postfix_Advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(')
                stack.push(i);

            else if (c == ')')
                if (stack.isEmpty())
                    System.out.print("-1" + "," + i + "\n");
                else
                    System.out.print(stack.pop() + "," + i + "\n");
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop() + ",-1" + "\n");
    }
}
