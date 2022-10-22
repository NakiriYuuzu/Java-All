package Data_Structure.DataClass.BinaryTree;

import java.util.Scanner;

class Node{
    char key;
    Node left, right;

    public Node(char str) {
        key = str;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree() {root = null;}

    void printPreorder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }

    void printInorder(Node node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.key + " ");
            printInorder(node.right);
        }
    }

    void printPostorder(Node node) {
        if (node != null) {
            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.key + " ");
        }
    }

    void printPreorder() {printPreorder(root);}
    void printInorder() {printInorder(root);}
    void printPostorder() {printPostorder(root);}
}

public class BinaryTreeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.print("請輸入7個英文字母(完滿二元樹)：");String str = sc.nextLine();System.out.println();
        char[] c = str.toCharArray();

        tree.root = new Node(c[0]);
        tree.root = new Node(c[0]);
        tree.root.left = new Node(c[1]);
        tree.root.right = new Node(c[2]);
        tree.root.left.left = new Node(c[3]);
        tree.root.left.right = new Node(c[4]);
        tree.root.right.left = new Node(c[5]);
        tree.root.right.right = new Node(c[6]);

        System.out.print("(中序)Inorder: ");
        tree.printInorder();
        System.out.println();

        System.out.print("(前序)Preorder: ");
        tree.printPreorder();
        System.out.println();

        System.out.print("(後序)Postorder: ");
        tree.printPostorder();
        System.out.println();
    }
}
