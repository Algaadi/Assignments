package assignment_1;

/*
Q7: Write a function to merge two sorted linked lists.
*/

public class Q7 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public Node merge(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;

            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}
