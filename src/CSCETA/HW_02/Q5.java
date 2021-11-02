package CSCETA.HW_02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] animal = {"Boar", "Rat", "Ox", "Tiger", "Hare", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog"};
        int n = sc.nextInt();
        if (n >= 0)
            System.out.printf("%d: %s%n", n, animal[(n % 12)]);
        else
            System.out.println(n + ": Wrong Input");
    }
}
