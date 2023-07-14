package Queue;

import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Integer> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int data) {
        queue.addLast(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

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
