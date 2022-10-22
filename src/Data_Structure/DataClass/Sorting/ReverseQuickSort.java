package Data_Structure.DataClass.Sorting;

public class ReverseQuickSort {
    static int n = 15;
    static int[] a = new int[n];

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        randomNum();
        quickSort(a, 0, a.length - 1);
        printSort(a);

        System.out.println("\nProgram decoding time: ");
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    static int partition(int[] arr, int low, int high) {
        int x = arr[low];
        int i = low;
        int j = high;

        while(true) {
            while (arr[i] > x)
                i++;

            while (arr[j] < x)
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            } else
                return j;
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
    }

    private static void printSort(int[] a) {
        System.out.println("After Sorting: ");
        for (int j : a) System.out.print(j + " ");
    }

    private static void randomNum() {
        System.out.println("Generate 10 random number: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 90) + 10;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
