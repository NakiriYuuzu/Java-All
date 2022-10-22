package Data_Structure.DataClass.Sorting;

public class TeacherQuickSort {
    public static int Num = 10;
    public static int[] A = new int[Num];

    public static void main(String[] args) {
        randomNum();
        quickSort(A, 0, A.length - 1);
        printSort(A);
    }

    private static void quickSort(int[] arr, int low, int high) {
        int p, i, j, temp;

        if (low >= high)
            return;

        p = arr[low];
        i = low;
        j = high;

        while (i < j) {
            while (arr[j] >= p && i < j)
                j--;

            while (arr[i] <= p && i < j)
                i++;

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        arr[low] = arr[i];
        arr[i] = p;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
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
}
