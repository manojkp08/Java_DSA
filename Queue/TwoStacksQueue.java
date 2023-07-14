package Queue;

import java.util.Stack;

public class TwoStacksQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;
    
    public TwoStacksQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    public void enqueue(int data) {
        inputStack.push(data);
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        
        return outputStack.pop();
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        
        return outputStack.peek();
    }
    
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
    
    public int size() {
        return inputStack.size() + outputStack.size();
    }
    
    public static void main(String[] args) {
        TwoStacksQueue queue = new TwoStacksQueue();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println("Size of queue: " + queue.size()); // Output: 3
        
        System.out.println("Front element: " + queue.peek()); // Output: 1
        
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
