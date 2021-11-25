package DataClass.linklist;

public class TestLinkedList {

    public static void main(String[] args) {
        Node p = null, pt = null;

        for (int i = 0; i < 3; i++) {
            Node node = new Node(i * 100);

            if (i == 0) {
                p    = node;
                pt   = node;
            } else {
                pt.link = node;
                pt = pt.link;
            }
        }

        while (p != null) {
            System.out.println(p.data);
            p = p.link;
        }
    }
}

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}