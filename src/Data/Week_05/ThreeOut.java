package Data.Week_05;

import java.util.Scanner;

public class ThreeOut {
    public static void main(String[] args) {
        new threeOut_WithoutArraysList();
    }
}

//2 5 8 1 6 0 7 4 9 3
class threeOut_WithoutArraysList {
    Scanner sc = new Scanner(System.in);

    public threeOut_WithoutArraysList() {
        int n = sc.nextInt();
        int[] threeOut = new int[3 * n];

        for (int i = 0; i < n; i++) {
            threeOut[i] = i;
        }
        for (int j = 0; j < n; j++) {
            if (j < n - 2) {
                System.out.print(threeOut[(3 * j) + 2] + 1);//輸出結果
                threeOut[(3 * j) + 2] = 0;//第三個位置設爲0
                threeOut[(2 * j) + n] = threeOut[j * 3];//第一個位置的換去最後一個位置
                threeOut[j * 3] = 0;//第一個位置的數設爲 0，0，3.。。
                threeOut[(2 * j) + n + 1] = threeOut[j * 3 + 1];
                threeOut[j * 3 + 1] = 0;
            }
            if (j == (n - 3)) {
                //System.out.print(threeOut[(2 * j) + n] + " ");
                System.out.print(threeOut[(2 * j) + n + 1] + 1);
            }
        }
    }
}