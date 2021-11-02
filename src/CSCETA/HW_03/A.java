package CSCETA.HW_03;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.setEdges(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println((triangle.isEquilateralTriangle())? "Yes" : "No");
    }
}

class Triangle {
    private int a, b, c;

    public void setEdges(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isEquilateralTriangle() {
        return a == b && b == c;
    }
}