package FinalExam.Test_02;

public class LinkList {

    transient Node head;

    static class Node {
        int data;
        Node next;

        public Node(int index) {
            data = index;
            next = null;
        }
    }

    void append(int index) {
        Node node = new Node(index);

        if (head == null) {
            head = new Node(index);
            return;
        }

        node.next = null;
        Node last = head;

        while (last.next != null)
            last = last.next;

        last.next = node;
    }

    void remove(int index) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == index) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != index) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " > ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        for (int i = 0; i < 11; i++)
            list.append(i);

        list.printList();
        System.out.println();

        for (int i = 0; i < 6; i++)
            list.remove(i);

        list.printList();
    }
}
