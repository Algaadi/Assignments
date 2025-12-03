package assignment_1;

/* Q16: Write a function to split a circular linked list into two halves */

public class Q16 {

    static class Node {
        int data;
        Node next;
        Node(int d){ data = d; }
    }

    public Node[] split(Node head) {

        if (head == null) return new Node[]{null, null};

        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {

            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = slow.next;
        slow.next = head;

        Node temp = head2;

        while (temp.next != head)
            temp = temp.next;

        temp.next = head2;

        return new Node[]{head, head2};
    }
}
