package assignment_1;

/*
Q4: Write a function to delete a node by value from a linked list.
*/

public class Q4 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public Node deleteNode(Node head, int value) {

        if (head == null) return null;

        if (head.data == value)
            return head.next;

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}
