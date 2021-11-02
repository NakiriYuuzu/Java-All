package DataClass;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1. N!\t2. Fib\t3. Gcd\t4. Hanoi\t");
            switch (sc.nextInt()) {
                case 1 -> System.out.println("N! = " + N(sc.nextInt()));
                case 2 -> System.out.println("Fib = " + Fib(sc.nextInt()));
                case 3 -> System.out.println("Gcd = " + Gcd(sc.nextInt(), sc.nextInt()));
                case 4 -> System.out.print("Hanoi = " + Hanoi(sc.nextInt(), 'a', 'b', 'c'));
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }

    private static int Hanoi(int n, char start, char temp, char end) {
        int count = 0;
        if (n == 1) {
            System.out.printf("Move a disk from %c to %c.%n", start, end);
            return 1;
        }
        else {
            count = count + Hanoi(n - 1, start, end, temp);
            System.out.printf("Move a disk from %c to %c.%n", start, end);
            count ++;
            count = count + Hanoi(n - 1, temp, start, end);
            return count;
        }
    }

    private static long Gcd(int n, int n1) {
        n *= n;
        if (n1 == 0)
            return n;
        else
            return Gcd(n1, n % n1);
    }

    private static long Fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n >= 2)
            return Fib(n - 1) + Fib(n - 2);
        else
            return 0;
    }

    private static long N(int n) {
        if (n == 0 || n == 1)
            return 1;
        else if (n >= 2)
            return n * N(n - 1);
        else
            return 0;
    }
}
