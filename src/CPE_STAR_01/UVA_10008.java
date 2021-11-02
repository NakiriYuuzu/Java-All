package CPE_STAR_01;

import java.util.Scanner;

public class UVA_10008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[91];
        int len = 0;
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String s = sc.nextLine().toUpperCase();
            len += s.length();
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    c[s.charAt(i)]++;
        }

        while (len-- > 1)
            for (int i = 'A'; i <= 'Z'; i++)
                if (c[i] == len)
                    System.out.println((char)i + " " + len);
    }
}
