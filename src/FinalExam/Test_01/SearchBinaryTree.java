package FinalExam.Test_01;

import java.util.Scanner;

public class SearchBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //輸入n筆資料
        long[] data = new long[1055555555]; //預設64格儲存資料
        int level, max = 0; //層級數

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); //依序輸入值存進Array
            int j = 1; // 樹根
            level = 1; // 階層
            while (data[j] != 0) {
                level++; //當有葉子存在，則增加一層
                if (a > data[j]) {//新進節點與樹葉進行比較，若新進節點數較大則放右邊
                    j = j * 2 + 1;
                } else //若新進節點較小則放左邊
                    j *= 2;
            }
            if (max < level) {
                max = level;
            }
            data[j] = a;
        }
        int num = (int) Math.pow(2, max); //所有樹的節點共，2的num次方節點數
        System.out.println(max);//層級輸出
        for (int i = 0; i < num; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }
}
