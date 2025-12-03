package assignment_1;

/* Q5: Write a function to concatenate two linked lists */

public class Q5 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public Node concatenate(Node a, Node b) {

        if (a == null) return b;
        Node temp = a;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = b;
        return a;
    }
}
