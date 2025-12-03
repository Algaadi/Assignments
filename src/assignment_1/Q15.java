package assignment_1;

/* Q15: Write a function to search for an element in a circular linked list */

public class Q15 {

    static class Node {
        int data;
        Node next;
        Node(int d){ data = d; }
    }

    public int search(Node head, int value) {

        if (head == null) return -1;

        Node temp = head;
        int pos = 1;

        do {
            if (temp.data == value) return pos;
            temp = temp.next;
            pos++;
        } while (temp != head);

        return -1;
    }
}
