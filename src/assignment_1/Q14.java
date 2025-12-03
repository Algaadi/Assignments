package assignment_1;

/* Q14: Write a function to delete a node from a specific position in a circular linked list */

public class Q14 {

    static class Node {
        int data;
        Node next;
        Node(int d){ data = d; }
    }

    public Node deleteAt(Node head, int pos) {

        if (head == null) return null;

        if (pos == 0) {

            Node temp = head;

            while (temp.next != head)
                temp = temp.next;

            if (temp == head) return null;

            temp.next = head.next;

            return head.next;
        }

        Node curr = head;

        for (int i = 0; i < pos - 1 && curr.next != head; i++)
            curr = curr.next;

        if (curr.next == head) return head;

        curr.next = curr.next.next;

        return head;
    }
}
