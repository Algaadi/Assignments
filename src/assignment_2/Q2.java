package assignment_2;

/* Q2: Write a function to sort a stack using only another Stack */

import java.util.Stack;

public class Q2 {

    public Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {

            int x = stack.pop();

            while (!temp.isEmpty() && temp.peek() > x) {
                stack.push(temp.pop());
            }

            temp.push(x);
        }

        return temp;
    }
}
