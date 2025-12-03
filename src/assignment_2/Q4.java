package assignment_2;

/* Q4: Implement a priority queue where the smallest element is dequeue first */

import java.util.PriorityQueue;

public class Q4 {

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public void enqueue(int value) {
        pq.add(value);
    }

    public int dequeue() {
        if (pq.isEmpty()) return -1;
        return pq.poll();  // returns smallest element
    }

    public int peek() {
        if (pq.isEmpty()) return -1;
        return pq.peek();
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }
}
