package assignment_1;

/* Q13: Write a function to insert a node at a specific position in a circular linked list */

public class Q13 {

    static class Node {
        int data;
        Node next;
        Node(int d){ data = d; }
    }

    public Node insertAt(Node head, int pos, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        if (pos == 0) {
            Node temp = head;

            while (temp.next != head)
                temp = temp.next;

            newNode.next = head;
            temp.next = newNode;

            return newNode;
        }

        Node curr = head;

        for (int i = 0; i < pos - 1 && curr.next != head; i++)
            curr = curr.next;

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
