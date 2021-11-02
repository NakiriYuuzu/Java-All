package CSCETA.HW_02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int startMin = (n[0] * 60) + n[1];
        int endMin = (n[2] * 60) + n[3];

        if (startMin > endMin)
            System.out.println("Wrong Input");
        else {
            int totalMin = endMin - startMin;
            if (totalMin < 30)
                System.out.println("Free");
            else
                System.out.printf("NT$: %d", (totalMin / 30) * 25);
        }
    }
}
