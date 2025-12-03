package assignment_1;

/* Q7: Write a function to search for element in singly linked list and return its position */

public class Q7 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public int search(Node head, int value) {
        int pos = 1;

        while (head != null) {
            if (head.data == value) return pos;
            head = head.next;
            pos++;
        }

        return -1;
    }
}
