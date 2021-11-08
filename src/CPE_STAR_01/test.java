package CPE_STAR_01;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String arr = sc.nextLine();

            char[] ascii = arr.toCharArray();
            int sum = 0;
            int max = 1;
            for (int temp : ascii) {
                int R = 0;
                if (temp >= 48 && temp <= 57)
                    R = temp - 48;
                if (temp >= 65 && temp <= 90)
                    R = temp - 55;
                if (temp >= 97 && temp <= 122)
                    R = temp - 61;
                sum += R;
                if (max < R)
                    max = R;
            }

            for (int i = max; i <= 62; i++) {
                if (i == 62) {
                    System.out.println("such number is impossible!");
                    break;
                }
                if (sum % i == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}