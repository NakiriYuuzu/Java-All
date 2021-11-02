package CPE_STAR_01;

import java.util.Scanner;

public class UVA_10222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";

        while (sc.hasNext()) {
            String str = sc.nextLine().toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ')
                    System.out.print(' ');
                else if (str.charAt(i) == '1' || str.charAt(i) == '`')
                    System.out.print(keyboard.charAt(0));
                else
                    System.out.print(keyboard.charAt(keyboard.indexOf(str.charAt(i)) - 2));
            }
            System.out.println();
        }
    }
}