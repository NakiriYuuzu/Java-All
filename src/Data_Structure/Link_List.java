package Data_Structure;

import java.util.Scanner;

public class Link_List {
    static class Student {
        int score;
        Student next;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Student getNext() {
            return next;
        }

        public void setNext(Student next) {
            this.next = next;
        }
    }

    private final Student head;

    public Link_List() {
        head = new Student();
        head.next = null;
    }

    public static void main(String[] args) {
        Link_List list = new Link_List();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
            list.insert(list.getLength(), sc.nextInt());

        list.printAllStudent();
    }

    public void insert(int position, int value) {
        Student student = new Student();
        Student toInsert = toNode(position);

        student.setScore(value);
        student.setNext(toInsert.getNext());
        toInsert.setNext(student);
    }

    public Student toNode(int local) {
        Student toN = head;
        for (int i = 0; i < local; i++)
            toN = toN.getNext();

        return toN;
    }

    public int getLength() {
        Student n = head;
        int count = 0;
        while (n.getNext() != null) {
            count += 1;
            n = n.getNext();
        }
        return count;
    }

    public void printAllStudent() {
        Student n = head;
        while (n.getNext() != null) {
            System.out.print(n.getNext().getScore() + " > ");
            n = n.getNext();
        }
        System.out.println();
    }
}
