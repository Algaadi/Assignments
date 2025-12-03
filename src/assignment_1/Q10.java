package assignment_1;

/* Q10: Write a function to remove duplicates elements from doubly linked list */

public class Q10 {

    static class Node {
        int data;
        Node prev, next;
        Node(int d){ data = d; }
    }

    public Node removeDuplicates(Node head) {

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;

                if (temp.next != null)
                    temp.next.prev = temp;

            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
