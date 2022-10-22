package Data_Structure;

public class SelectionSort {
    public static int Num = 10;
    public static int[] A = new int[Num];

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        randomNum();
        selectionSort(A);
        printSort(A);

        System.out.println("\nProgram decoding time: ");
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    private static void printSort(int[] A) {
        System.out.println("排序後的號碼：");
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

    private static void selectionSort(int[] arr) {
        if (arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i; j < arr.length; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
