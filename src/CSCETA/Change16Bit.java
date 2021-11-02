package CSCETA;

import java.util.Scanner;

public class Change16Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();//6666
        int n = sc.nextInt();//16
        int[] arr = new int[50];

        // ascii 定義 0~9 A~z
        for (int i = 0; i < 50; i++) {
            if (i < 10)
                arr[i] = i + 48;
            else
                arr[i] = i + 55;
        }


        StringBuilder str = new StringBuilder("");
        while (x != 0) { //i不等於0，就會執行
            str.append((char) arr[x % n]); //每次加比如i%n = 1，str =0， 就會得到10
            x = x / n; //執行i會除于n
        }

        //因爲我們是從大到小，所以必須反轉
        System.out.println(str.reverse());
    }
}
