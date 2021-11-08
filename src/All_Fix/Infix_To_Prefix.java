package All_Fix;

import java.util.Stack;

public class Infix_To_Prefix {
    static boolean isAlpha(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean isOperator(char c) {
        return (!isAlpha(c) && !isDigit(c));
    }

    static int getPriority(char C) {
        if (C == '-' || C == '+')
            return 1;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '^')
            return 3;

        return 0;
    }

    // Reverse the letters of the word
    static String reverse(char[] str, int start, int end) {

        // Temporary variable to store character
        char temp;
        while (start < end) {

            // Swapping the first and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    static String infixToPostfix(char[] infix1) {
        System.out.println(infix1);
        String infix = '(' + String.valueOf(infix1) + ')';

        int l = infix.length();
        Stack<Character> char_stack = new Stack<>();
        String output = "";

        for (int i = 0; i < l; i++) {

            // If the scanned character is an
            // operand, add it to output.
            if (isAlpha(infix.charAt(i)) || isDigit(infix.charAt(i)))
                output += infix.charAt(i);

                // If the scanned character is an
                // ‘(‘, push it to the stack.
            else if (infix.charAt(i) == '(')
                char_stack.add('(');

                // If the scanned character is an
                // ‘)’, pop and output from the stack
                // until an ‘(‘ is encountered.
            else if (infix.charAt(i) == ')') {
                while (char_stack.peek() != '(') {
                    output += char_stack.peek();
                    char_stack.pop();
                }

                // Remove '(' from the stack
                char_stack.pop();
            }

            // Operator found
            else {
                if (isOperator(char_stack.peek())) {
                    while ((getPriority(infix.charAt(i)) <
                            getPriority(char_stack.peek()))
                            || (getPriority(infix.charAt(i)) <=
                            getPriority(char_stack.peek())
                            && infix.charAt(i) == '^')) {
                        output += char_stack.peek();
                        char_stack.pop();
                    }

                    // Push current Operator on stack
                    char_stack.add(infix.charAt(i));
                }
            }
        }
        return output;
    }

    static String infixToPrefix(char[] infix) {
        /*
         * Reverse String Replace ( with ) and vice versa Get Postfix Reverse Postfix *
         */
        int l = infix.length;

        // Reverse infix
        String infix1 = reverse(infix, 0, l - 1);
        infix = infix1.toCharArray();

        // Replace ( with ) and vice versa
        for (int i = 0; i < l; i++) {

            if (infix[i] == '(') {
                infix[i] = ')';
                i++;
            } else if (infix[i] == ')') {
                infix[i] = '(';
                i++;
            }
        }

        String prefix = infixToPostfix(infix);

        // Reverse postfix
        prefix = reverse(prefix.toCharArray(), 0, l - 1);

        return prefix;
    }

    // Driver code
    public static void main(String[] args) {
        String s = ("x+y*z/w+u");
        System.out.print(infixToPrefix(s.toCharArray()));
    }
}
