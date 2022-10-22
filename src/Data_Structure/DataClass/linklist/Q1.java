package Data_Structure.DataClass.linklist;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        LinkedListYuuzu list = new LinkedListYuuzu();
        list.append(100);
        list.append(200);
        list.append(300);

        while (true) {
            System.out.print("1. Push \t 2. Append \t 3. insertAfter\t 4. Delete \t 0. Exit\n");
            System.out.print("Select Your Function: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Selected 1: Input your number to push: ");
                    list.push(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Selected 2: Input your number to append: ");
                    list.append(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Selected 3: Input your number to insertAfter: ");
                    list.insertAfter(list.head.link, sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Selected 4: Input your number to Delete: ");
                    list.deleteNode(sc.nextInt());
                }
                default -> System.exit(0);
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.print("Linked list data is: ");
            list.printList();
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }
}

class LinkedListYuuzu {
    transient Node head;

    static class Node {
        int data;
        Node link;

        Node(int d) {
            data = d;
            link = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);

        new_node.link = head;

        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.link = prev_node.link;
        prev_node.link = new_node;
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.link = null;

        Node last = head;
        while (last.link != null)
            last = last.link;

        last.link = new_node;
    }

    void deleteNode(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.link; // Changed head
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.link;
        }

        if (temp == null)
            return;

        prev.link = temp.link;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.link;
        }
    }
}