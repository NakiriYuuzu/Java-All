package CPE_STAR_01;

import java.util.Scanner;

public class UVA_10093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int sum = 0;
            int max = 1;
            char[] ascii = s.toCharArray();

            for (int temp : ascii) {
                int tmp = 0;
                if (temp >= 48 && temp <= 57)
                    tmp = temp - 48;
                else if (temp >= 65 && temp <= 90)
                    tmp = temp - 55;
                else if (temp >= 97 && temp <= 122)
                    tmp = temp - 61;
                sum += tmp;
                if (max < tmp)
                    max = tmp;
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
