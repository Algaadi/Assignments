package assignment_2;

/*
Q4: Implement a Stack ADT using arrays with the following operations:
     - push(value)
     - pop()
     - peek()
     - isEmpty()
*/

public class Q4 {

    int[] stack = new int[100];
    int top = -1;

    public void push(int value) {
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) return -1;
        return stack[top--];
    }

    public int peek() {
        if (top == -1) return -1;
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Q4 s = new Q4();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.pop());
    }
}
