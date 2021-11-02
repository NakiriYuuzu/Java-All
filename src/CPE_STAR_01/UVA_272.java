package CPE_STAR_01;

import java.util.Scanner;

public class UVA_272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '"') {
                    if (count % 2 == 0)
                        System.out.print("``");
                    else
                        System.out.print("''");

                    count++;
                }
                else
                    System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
