import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> arr = new Stack<>();
        String a = sc.nextLine();
        String b = sc.nextLine();

        getInput(a, arr);
        getInput(b, arr);

        Collections.sort(arr);

        printOutput(arr);
    }

    private static boolean checkDuplicate(char c, Stack<String> arr) {
        String s = c + "";
        boolean checked = true;
        for (String value : arr)
            if (value.equals(s)) {
                checked = false;
                break;
            }

        return checked;
    }

    private static void getInput(String s, Stack<String> arr) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (arr.isEmpty())
                arr.push(c + "");

            else
                if (checkDuplicate(c, arr))
                    arr.add(c + "");
        }
    }

    private static void printOutput(Stack<String> arr) {
        for (int i = 0; i < arr.size(); i++)
            if (i == arr.size() - 1)
                System.out.print(arr.get(i));
            else
                System.out.print(arr.get(i) + ",");

        System.out.println();
    }
}