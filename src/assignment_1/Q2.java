package assignment_1;

/*
Q2: Write a program to create a singly linked list and perform insertion at beginning.
*/

class Node2 {
    int data;
    Node2 next;
    Node2(int d) { data = d; }
}

public class Q2 {

    Node2 head;

    public void insertAtBeginning(int data) {
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Q2 list = new Q2();
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();
    }
}
