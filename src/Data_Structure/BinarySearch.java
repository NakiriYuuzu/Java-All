package Data_Structure;

public class BinarySearch {
    public static int n = 10;
    public static int[] a = new int[n];

    public static void main(String[] args) {
        randomNum();
        quickSort(a, 0, a.length - 1);
        printSort(a);
        int ram = a[(int) (Math.random() * a.length - 1)];
        int find = binary(a, ram);

        System.out.println("\n要尋找的數：" + ram);
        System.out.println(find >= 0 ? "找到數值位於索引: " + find : "找不到索引");
    }

    static int binary(int[] number, int des) {
        int low = 0;
        int upper = number.length - 1;

        while (low <= upper) {
            int mid = (low + upper) / 2;

            if (number[mid] < des)
                low = mid + 1;
            else if (number[mid] > des)
                upper = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
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
