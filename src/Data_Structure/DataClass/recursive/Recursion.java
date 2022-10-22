package Data_Structure.DataClass.recursive;

import java.util.Scanner;

public class Recursion {
    private static int count = 0;
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\n1. N!\t2. Fib\t3. Gcd\t4. Hanoi\t5. fact");
            switch (sc.nextInt()) {
                case 1 -> System.out.println("N! = " + recursion.N(sc.nextInt()));
                case 2 -> System.out.println("Fib = " + recursion.Fib(sc.nextInt()));
                case 3 -> {System.out.println("Gcd = " + recursion.Gcd(sc.nextInt(), sc.nextInt())); System.out.println(count);}
                case 4 -> System.out.print("Hanoi = " + recursion.Hanoi(sc.nextInt(), 'a', 'b', 'c'));
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }

    public int Hanoi(int n, char start, char temp, char end) {
        int count = 0;
        if (n == 1) {
            System.out.printf("Move a disk from %c to %c.%n", start, end);
            return 1;
        } else {
            count += Hanoi(n - 1, start, end, temp);
            System.out.printf("Move a disk from %c to %c.%n", start, end);
            count++;
            count += Hanoi(n - 1, temp, start, end);
            return count;
        }
    }

    public long Gcd(int n, int n1) {
        n *= n;
        if (n1 == 0) {
            count ++;
            return n;
        }
        else {
            count++;
            return Gcd(n1, n % n1);
        }
    }

    public long Fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n >= 2)
            return Fib(n - 1) + Fib(n - 2);
        else
            return 0;
    }

    public long N(int n) {
        if (n == 0 || n == 1)
            return 1;
        else if (n >= 2)
            return n * N(n - 1);
        else
            return 0;
    }
}
