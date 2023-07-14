package Stack;

import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<Integer> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    public void push(int data) {
        stack.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack();

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
