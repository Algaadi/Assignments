package assignment_1;

/* Q11: Write a function to traverse a doubly linked list in reverse and print all the elements */

public class Q11 {

    static class Node {
        int data;
        Node prev, next;
        Node(int d){ data = d; }
    }

    public void reverseTraverse(Node tail) {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
