package Data_Structure.DataClass;

import Data_Structure.DataClass.BinaryTree.BinaryTreeWithMath;
import Data_Structure.TreeLeafRecursive;
import Data_Structure.AdvancedBubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.樹的排序\t 2.樹的拜訪\t 3.BubbleSort \t");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("請輸入數字或字母（不用空格隔開）");
                sc.nextLine();
                String data = sc.nextLine();

                System.out.println("前序：");
                BinaryTreeWithMath.preOrder(0, data);
                System.out.println();

                System.out.println("中序：");
                BinaryTreeWithMath.inOrder(0, data);
                System.out.println();

                System.out.println("後序：");
                BinaryTreeWithMath.postOrder(0, data);
                System.out.println();
            }

            else if (n == 2) {
                int x = sc.nextInt();
                int[] tree = new int[x];

                for (int i = 0; i < x; i++)
                    tree[i] = sc.nextInt();

                TreeLeafRecursive.traversal(tree, 1);
                TreeLeafRecursive.getOutput();
            }

            else if (n == 3) {
                System.out.println("請輸入數字（用空格隔開！）");

                ArrayList<Integer> num = new ArrayList<>();
                sc.nextLine();
                String[] str = sc.nextLine().split("\\s+");

                for (String s : str) {
                    num.add(Integer.parseInt(s));
                    System.out.print(s + " ");
                }

                System.out.println();
                AdvancedBubbleSort.bubbleSort(num, num.size());
                AdvancedBubbleSort.printBubbleSort(num);
                System.out.println();
            }

            else
                return;

            System.out.println("=====================================================================================");
        }
    }
}
