package DataClass;

import java.util.Arrays;
import java.util.Scanner;

public class TestFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            char[] c   = str.toCharArray();
            System.out.println(Arrays.toString(c));
        }
    }
}
