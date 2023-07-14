package Stack;

import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Integer> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(int data) {
        stack.addLast(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.removeLast();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of stack: " + stack.size()); // Output: 3

        System.out.println("Top element: " + stack.peek()); // Output: 3

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
