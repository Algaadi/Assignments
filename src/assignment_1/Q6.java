package assignment_1;

/*
Q6: Write a function to rotate a linked list to the right by k places.
*/

public class Q6 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public Node rotateRight(Node head, int k) {

        if (head == null || k == 0) return head;

        Node temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head;  
        k = k % length;

        int steps = length - k;

        Node newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;

        newTail.next = null;

        return newHead;
    }
}
