package assignment_1;

/*
Q10: Write a function to count the number of nodes in a singly linked list.
*/

public class Q10 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public int count(Node head) {
        int c = 0;

        while (head != null) {
            c++;
            head = head.next;
        }

        return c;
    }
}
