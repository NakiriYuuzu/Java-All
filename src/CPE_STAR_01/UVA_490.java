package CPE_STAR_01;

import java.util.ArrayList;
import java.util.Scanner;

public class UVA_490 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int count = 0, max = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            if (s.length() > max) {
                max = s.length();
                count = list.size();
            }
            list.add(s);
        }

        for (int i = 0; i < max; i++) {
            for (int j = list.size() - 1; j >= 0; j--) {
                if (i < list.get(j).length()) {
                    System.out.print(list.get(j).charAt(i));
                } else if (j > count) {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}