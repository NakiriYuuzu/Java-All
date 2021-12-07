package DataClass.AfterMidTerm;

public class BubbleSort {
    static int n = 10;
    static int[] a = new int[n];

    public static void main(String[] args) {
        randomNum();
        bubbleSort(a, n);
        printBubbleSort(a);
    }

    static void randomNum() {
        System.out.println("隨機數：");
        for (int i = 0; i < n; i++) {
            a[i] = (int) ((Math.random() * 90) + 11);
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    static void bubbleSort(int[] a, int n) {
        int temp;
        for (int i = n - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
    }

    static void printBubbleSort(int[] a) {
        System.out.println("排序10個亂數值: ");
        for (int x : a)
            System.out.print(x + " ");
    }
}
