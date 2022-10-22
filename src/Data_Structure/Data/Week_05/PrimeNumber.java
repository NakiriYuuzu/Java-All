package Data_Structure.Data.Week_05;

import java.util.*;

public class PrimeNumber {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;

        for(int i = 1; i <= n; i++) {
            if(isPrimer(i)) {
                count ++;
                System.out.print(i + ",");
            }
        }
        System.out.println("共" + count + "個");
    }

    public static boolean isPrimer(int n) {
        int cc = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cc++;
            }
        }
        return cc == 2;
    }
}