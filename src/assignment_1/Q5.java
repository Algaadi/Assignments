package assignment_1;

/*
Q5: Write a function to reverse a linked list.
*/

public class Q5 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public Node reverse(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
