package FinalExam.Test_01;

public class LinkList {

    transient int size = 0;
    transient Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    void append(int n) {
        Node node = new Node(n);

        if (head == null) {
            head = new Node(n);
            return;
        }

        node.next = null;
        Node last = head;

        while (last.next != null)
            last = last.next;

        last.next = node;
        size++;
    }

    void delete(int n) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == n) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != n) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " > ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        for (int i = 0; i < 10; i++)
            list.append(i);

        list.print();
        System.out.println();

        for (int i = 0; i < 5; i++)
            list.delete(i);

        list.print();
    }
}
