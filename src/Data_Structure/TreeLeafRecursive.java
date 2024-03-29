package Data_Structure;

import java.util.Scanner;

public class TreeLeafRecursive {
    static int inner = 0, leaf = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tree = new int[n];

        for (int i = 0; i < n; i++)
            tree[i] = sc.nextInt();

        traversal(tree, 1);
        System.out.println(inner);
        System.out.println(leaf);
    }

    public static void traversal(int[] tree, int index) {
        boolean left = true, right = true;
        if (index * 2 >= tree.length || tree[index * 2] == 0)
            left = false;
        if (index * 2 + 1 >= tree.length || tree[index * 2 + 1] == 0)
            right = false;

        if (!left && !right)
            leaf++;
        else
            inner++;

        if (left)
            traversal(tree, index * 2);
        if (right)
            traversal(tree, index * 2 + 1);
    }

    public static void getOutput() {
        System.out.println("Inner: " + inner);
        System.out.println("Left: " + leaf);
    }
}
