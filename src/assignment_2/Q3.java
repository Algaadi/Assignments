package assignment_2;

/*
Q3: Implement a singly linked list with the following operations:
     - insert(element)
     - delete(element)
     - search(element)
     - traverse()
*/

public class Q3 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int value) {

        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public int search(int value) {
        Node temp = head;
        int pos = 0;

        while (temp != null) {
            if (temp.data == value) return pos;
            temp = temp.next;
            pos++;
        }

        return -1;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Q3 list = new Q3();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.traverse();
    }
}
