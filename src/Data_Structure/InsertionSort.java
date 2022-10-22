package Data_Structure;

public class InsertionSort {
    public static int Num = 10;
    public static int[] A = new int[Num];

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        randomNum();
        insertionSort(A);
        printSort(A);

        System.out.println("\nProgram decoding time: ");
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    private static void insertionSort(int[] a) {
        if (a.length == 0)
            return;

        int current;
        for (int i = 0; i < a.length - 1; i++) {
            current = a[i + 1];
            int preIndex = i;

            while (preIndex >= 0 && current < a[preIndex]) {
                a[preIndex + 1] = a[preIndex];
                preIndex --;
            }

            a[preIndex + 1] = current;
        }
    }

    private static void printSort(int[] A) {
        System.out.println("After Sorting: ");
        for (int i = 0; i < Num; i++)
            System.out.print(A[i] + " ");
    }

    private static void randomNum() {
        System.out.println("Generate 10 random number: ");
        for (int i = 0; i < Num; i++) {
            A[i] = (int) (Math.random() * 90) + 10;
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
