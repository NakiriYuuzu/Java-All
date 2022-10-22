package Data_Structure.DataClass.BinaryTree;

import java.util.Scanner;

class BinarySearchTree {

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void preOrder() {preorderRec(root);}
    void inOrder() {inorderRec(root);}
    void postOrder() {postorderRec(root);}

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();

        while (true) {
            System.out.print("Binary Search Method: (1)Insert (2)Delete (3)Preorder (4)Inorder (5)Postorder: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Please input a number to insert on tree: ");
                    tree.insert(sc.nextInt());
                    System.out.print("Current key in tree: ");
                    tree.inOrder();
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.print("Please input a number to delete a node on tree: ");
                    tree.deleteKey(sc.nextInt());
                    System.out.print("Current key in tree: ");
                    tree.inOrder();
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.print("(前序)Preorder: ");
                    tree.preOrder();
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.print("(中序)Inorder: ");
                    tree.inOrder();
                    System.out.println("\n");
                }
                case 5 -> {
                    System.out.print("(后序)Postorder: ");
                    tree.postOrder();
                    System.out.println("\n");
                }
                default -> {
                    System.out.println("Exit....");
                    System.exit(1);
                }
            }
        }
    }
}