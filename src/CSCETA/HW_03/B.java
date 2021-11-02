package CSCETA.HW_03;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        Triangle1 triangle1 = new Triangle1(a, b, c);
        // no need this
        // triangle1.setEdges(a, b, c);
        System.out.println(triangle1.isTriangle() ? "Yes" : "No");
    }
}

class Triangle1 {
    private int a, b, c;

    public Triangle1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setEdges(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[0] + arr[1] > arr[2];
    }
}