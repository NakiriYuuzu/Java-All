package Data_Structure.Data.MidExam;

import java.util.Scanner;

public class Hanoi {
    static int hanoi(int n, char start, char temp, char end) {
        int count = 0;
        if (n == 1) {
            System.out.printf("disk %c move to disk %c.%n", start, end);
        }
        else {
            count += hanoi(n - 1, start, end, temp);
            System.out.printf("disk %c move to disk %c.%n", start, end);
            count ++;
            count += hanoi(n - 1, temp, start, end);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hanoi(n, 'a', 'b', 'c'));
    }
}
