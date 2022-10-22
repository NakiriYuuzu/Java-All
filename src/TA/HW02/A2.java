package TA.HW02;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Teacher james = new Teacher(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.printf("Name:%s,Salary:%d,Bonus:%d\n", james.getName(), james.getPayment(), james.getBonus());
        }
    }
}
