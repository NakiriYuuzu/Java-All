package Data_Structure.Data.Week03;

import java.util.Scanner;
import java.util.Stack;

public class Q1_Stack_Postfix {
    public static int MaxNum = 12;
    public static char[] Stack = new char[MaxNum];
    // public static int Top = -1;

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.empty();

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入中序的運算式: ");
        String str = sc.nextLine();
        int n = str.length();

        for (int i = 0; i < n; i++)
            Stack[i] = str.charAt(i);

        Postfix(Stack);
    }

    private static void Postfix(char[] Stack) {
        int i, Top = 0;
        char op;
        System.out.print("輸出後序的結果： ");

        for (i = 0; i < Stack.length; i++) {
            op = Stack[i];

            switch (op) {
                case '\0':
                    while (Top > 0) {
                        System.out.print(Stack[Top]);
                        Top--;
                    }
                case '(':
                    if (Top < Stack.length) {
                        Top++;
                        Stack[Top] = op;
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    while (Priority(Stack[Top]) >= Priority(op)) {
                        System.out.print(Stack[Top]);
                        Top--;
                    }
                    Top++;
                    Stack[Top] = op;
                    break;
                case ')':
                    while (Stack[Top] != '(') {
                        System.out.print(Stack[Top]);
                        Top--;
                    }
                    Top--;
                    break;
                default:
                    System.out.print(op);
                    break;
            }
        }
    }

    public static int Priority(char op) {
        int p;
        switch (op) {
            case '+':
            case '-':
                p = 1;
                break;
            case '*':
            case '/':
                p = 2;
                break;
            default:
                p = 0;
                break;
        }
        return p;
    }
}
