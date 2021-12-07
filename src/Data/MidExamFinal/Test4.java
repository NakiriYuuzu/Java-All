package Data.MidExamFinal;

import java.util.*;

public class Test4 {

    static int postIn(Stack<String> s) {
		Stack<Integer> num = new Stack<>();

        for (String c : s) {
            if (c.matches("[0-9]+"))
                num.push(Integer.parseInt(c));

            else {
                int a = num.pop();
                int b = num.pop();

                switch (c) {
                    case "+" -> num.push(b + a);
                    case "-" -> num.push(b - a);
                    case "*" -> num.push(b * a);
                    default -> num.push(b / a);
                }
            }
        }

        return num.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> store = new Stack<>();
        String line;

        while(!(line = sc.nextLine()).isEmpty()) {
            String[] values = line.split("\\s+");
            for (String value : values) store.push(value);

            System.out.println(postIn(store));
        }
    }
}
