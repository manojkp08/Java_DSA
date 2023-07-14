package Queue;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

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
