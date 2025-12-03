package assignment_2;

/*
Q5: Implement a Queue ADT using arrays with the following operations:
     - enqueue(value)
     - dequeue()
     - front()
     - isEmpty()
*/

public class Q5 {

    int[] queue = new int[100];
    int front = 0;
    int rear = 0;

    public void enqueue(int value) {
        queue[rear++] = value;
    }

    public int dequeue() {
        if (front == rear) return -1;
        return queue[front++];
    }

    public int front() {
        if (front == rear) return -1;
        return queue[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String[] args) {
        Q5 q = new Q5();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
    }
}
