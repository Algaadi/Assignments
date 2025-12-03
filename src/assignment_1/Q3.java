package assignment_1;

/*
Q3: Write a program to insert a node at the end of a singly linked list.
*/

class Node3 {
    int data;
    Node3 next;
    Node3(int d) { data = d; }
}

public class Q3 {

    Node3 head;

    public void insertAtEnd(int data) {
        Node3 newNode = new Node3(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void display() {
        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Q3 list = new Q3();
        list.insertAtEnd(5);
        list.insertAtEnd(15);
        list.insertAtEnd(25);
        list.display();
    }
}
