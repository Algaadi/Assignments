package assignment_2;

/* Q3: Write a function to reverse the order of elements in a queue */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q3 {

    public Queue<Integer> reverseQueue(Queue<Integer> q) {

        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty())
            stack.push(q.remove());

        while (!stack.isEmpty())
            q.add(stack.pop());

        return q;
    }
}
