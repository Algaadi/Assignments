package assignment_1;

/* Q9: Write a function to remove at specific position from singly linked list */

public class Q9 {

    static class Node {
        int data;
        Node next;
        Node(int d){ data = d; }
    }

    public Node removeAt(Node head, int pos) {

        if (head == null) return null;

        if (pos == 0)
            return head.next;

        Node temp = head;

        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) return head;

        temp.next = temp.next.next;

        return head;
    }
}
