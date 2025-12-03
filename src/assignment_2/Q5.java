package assignment_2;

/* Q5: Write a function to merge two sorted queues into a single sorted queue */

import java.util.LinkedList;
import java.util.Queue;

public class Q5 {

    public Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {

        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {

            if (q1.peek() < q2.peek())
                result.add(q1.remove());
            else
                result.add(q2.remove());
        }

        while (!q1.isEmpty())
            result.add(q1.remove());

        while (!q2.isEmpty())
            result.add(q2.remove());

        return result;
    }
}
