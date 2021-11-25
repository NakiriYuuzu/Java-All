package All_Fix;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入你的問題：");
        String s = sc.nextLine();
        System.out.println("1.前轉中\t2.前轉後\t3.中轉前\t4.中轉後\t5.後轉前\t6.後轉中\t");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println(Prefix_To_Infix.convert(s));
            case 2 -> System.out.println(Prefix_To_Postfix.preToPost(s));
            case 3 -> System.out.println(Infix_To_Prefix.infixToPrefix(s));
            case 4 -> System.out.println(Infix_To_Postfix.infixToPostfix(s));
            case 5 -> System.out.println(Postfix_To_Prefix.postToPre(s));
            case 6 -> System.out.println(Postfix_To_Infix.getInfix(s));
        }
    }
}
