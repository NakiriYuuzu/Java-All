package Data.Week_05;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ThreeOut_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        threeOutQueue(sc.nextInt());
        System.out.print(recursionN(sc.nextInt()));
    }
    public static void threeOutQueue(int n) {
        Queue<Integer> queue = new ArrayDeque<>();
        int count = 0;
        for (int i = 1; i <= n; i++)
            queue.add(i);

        while (!queue.isEmpty()) {
            ++count;
            if (count == 3) {
                System.out.print(queue.remove() + " ");
                count = 0;
            }
            else
                queue.add(queue.poll());
        }
    }

    private static int recursionN(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * recursionN(n - 1);
    }
}
