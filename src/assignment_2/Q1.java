package assignment_2;

/* Q1: Write a function to reverse a string using Stack */

import java.util.Stack;

public class Q1 {

    public String reverseString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            stack.push(c);

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
