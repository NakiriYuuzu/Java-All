package CPE_STAR_01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "47.5";
        for (int base : new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 16, 32}) {
            Integer i = Integer.parseInt(s, base);
            System.out.println(base + " " + i);
        }
//
//        int i = 00001010;
//        for (int base : new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 16}) {
//            String str = Integer.toString(i, base);
//        }
    }
}