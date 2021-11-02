package Data.Week03;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(500);
        stack.push(300);
        stack.push(100);

        int len = stack.size();

        for (int i = 0; i < len; i++)
            System.out.println(stack.pop());
    }
}
