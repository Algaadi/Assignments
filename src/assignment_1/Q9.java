package assignment_1;

/*
Q9: Write a function to find the index of a given value in a linked list.
If the value is not found, return -1.
*/

public class Q9 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public int indexOf(Node head, int value) {
        int index = 0;

        while (head != null) {
            if (head.data == value) return index;
            head = head.next;
            index++;
        }

        return -1;
    }
}
