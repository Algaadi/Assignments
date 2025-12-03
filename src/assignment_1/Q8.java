package assignment_1;

/* Q8: Write a function to find the index of a given data value in a linked list.
       If the data value is not found in the linked list, return -1.
*/

public class Q8 {

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
