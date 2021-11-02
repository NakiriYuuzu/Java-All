package Data.Week04;

import java.util.ArrayDeque;
import java.util.Queue;

public class HowQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.forEach(System.out::println);
    }
}
