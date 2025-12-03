package assignment_1;

/* Q12: Write a function to search for an element in a doubly linked list */

public class Q12 {

    static class Node {
        int data;
        Node prev, next;
        Node(int d){ data = d; }
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
