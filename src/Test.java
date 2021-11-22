import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        triangle triangle = new triangle();

        System.out.println(triangle.getA());
        int n = sc.nextInt(),sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += n % 10;
            n /= 10;
        }

        if (sum / 7 == 0 && sum / 3 == 0)
            System.out.println("Yes");
        else
            System.out.println("None");
    }
}
class triangle {
    private int a, b, c;

    public void setEdges(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        return a * b > c || a * c > b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}