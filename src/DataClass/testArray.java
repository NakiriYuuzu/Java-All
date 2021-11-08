package DataClass;

public class testArray {
    public static void main(String[] args) {
        int[][][] n = new int[5][2][3];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 3; k++)
                    n[i][j][k] ++;

        for (int[][] a : n) {
            for (int[] b : a) {
                for (int c : b)
                    System.out.print(c + " ");
                System.out.println();
            }
        }
    }
}
