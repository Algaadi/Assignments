package assignment_1;

/*
Q11: Write a function to detect if a linked list contains a cycle.
*/

public class Q11 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public boolean hasCycle(Node head) {

        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}
