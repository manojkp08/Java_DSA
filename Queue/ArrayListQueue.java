package Queue;

import java.util.ArrayList;

public class ArrayListQueue {
    private ArrayList<Integer> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int data) {
        queue.add(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        ArrayListQueue queue = new ArrayListQueue();

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
