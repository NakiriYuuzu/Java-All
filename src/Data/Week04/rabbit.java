package Data.Week04;

import java.util.Scanner;

public class rabbit {
    public static int NUM = 5;
    public static int[] Queue = new int[NUM];
    public static int Rear;
    public static int Front;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        char item;
        Rear = -1;
        Front = -1;

        while (op != -1) {
            System.out.println("1. enqueue\t 2.dequeue \t 3.show current data");
            System.out.print("Input your activity: ");
            String str = sc.nextLine();
            op = Integer.parseInt(str);
            switch (op) {
                case 1:
                    System.out.print("Please input your data: ");
                    String str1 = sc.nextLine();
                    item = str1.charAt(0);
                    Enqueue(item);
                    break;
                case 2:
                    item = Dequeue();
                    System.out.println(item + "data delete from queue.");
                    break;
                case 3:
                    printQueue();
                    break;
            }
        }
    }

    private static void printQueue() {
        for (int i = Rear; i >= Front + 1; i--)
            System.out.println((char)Queue[i]);
    }

    private static char Dequeue() {
        if (Front == Rear) {
            System.out.println("Queue is empty!");
            return 'x';
        }
        else
            return (char) Queue[++Front];
    }

    private static void Enqueue(char item) {
        if (Rear == NUM -1) {
            System.out.println("Queue is full!");
        }
        else
            Queue[++Rear] = item;
    }
}
