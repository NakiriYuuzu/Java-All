package Data_Structure.DataClass.BinaryTree;

import java.util.Scanner;

public class BinaryTreeWithMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        System.out.print("Pre Order: ");
        preOrder(0, data);
        System.out.println();

        System.out.print("In Order: ");
        inOrder(0, data);
        System.out.println();

        System.out.print("Post Order: ");
        postOrder(0, data);
        System.out.println();
    }

    public static void preOrder(int i, String data) {
        if (i < data.length()) {
            System.out.print(data.charAt(i)); //Mid
            preOrder(i * 2 + 1, data);     //Left
            preOrder(i * 2 + 2, data);     //Right
        }
    }

    public static void inOrder(int i, String data) {
        if (i < data.length()) {
            inOrder(i * 2 + 1, data);     //Left
            System.out.print(data.charAt(i)); //Mid
            inOrder(i * 2 + 2, data);     //Right
        }
    }

    public static void postOrder(int i, String data) {
        if (i < data.length()) {
            postOrder(i * 2 + 1, data);     //Left
            postOrder(i * 2 + 2, data);     //Right
            System.out.print(data.charAt(i)); //Mid
        }
    }
}
