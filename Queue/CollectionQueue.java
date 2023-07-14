package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Size of queue: " + queue.size()); // Output: 3

        System.out.println("Front element: " + queue.peek()); // Output: 1

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
