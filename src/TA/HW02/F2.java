package TA.HW02;

import java.util.ArrayList;
import java.util.Scanner;

public class F2 {
    public static void main(String[] args) {
        // for store the size of lakes
        ArrayList<Integer> lakeSizeList = new ArrayList<>();
        //
        Scanner kb = new Scanner(System.in);
        // read the dimension of the map
        int m = kb.nextInt();
        int n = kb.nextInt();

        // allocate 2d array for storing the map


        int[][] map = new int[m + 2][n + 2];

        // initialize all values as -2 (marker)
        for (int i = 0; i <= m + 1; i++) {
            for (int j = 0; j <= n + 1; j++) {
                map[i][j] = -2;  // marker(-2) as non-water
            }
        }
        // read the map data
        for
        (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = kb.nextInt();
            }
        }
        //
        // showMap(map, m, n);
        // find all lakes by checking every cell in the map
        for (int i = 1; i <= m; i++) {
            for (
                    int j = 1; j <= n; j++) {
                int size = findLake(map, i, j);
                // existing a lake?
                if (size > 0)
                    lakeSizeList.add(size);
            }
        }

        // print the size of lakes from large to small.
        lakeSizeList.forEach(System.out::println);
    }

    //
    // Recursive Method: findLake
    //
    public static int findLake(int[][] map, int x, int y) {
        // Is Land?
        if (map[x][y] == 0 || map[x][y] == 1 || map[x][y] == 2 || map[x][y] == 3)
            return 0;
        // Is boundary(marker as -2)?
        if (map[x][y] == -2)
            return 0;
        // Is visited(marker as -1)?
        if (map[x][y] == -1)
            return 0;
        //
        map[x][y] = -1;
        //
        return (1 + findLake(map, x - 1, y) + findLake(map, x + 1, y)
                + findLake(map, x, y - 1) + findLake(map, x, y + 1));
        //
    }
}