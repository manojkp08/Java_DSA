package LinkedList;

public class CircularLLReverse {
    private Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The circular linked list is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public void reverse() {
        if (head == null || head.next == head) {
            return; // Empty or only one node, no need to reverse
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head = prev;
    }

    public static void main(String[] args) {
        CircularLLReverse list = new CircularLLReverse();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original Circular Linked List:");
        list.display(); // Output: 1 2 3 4

        System.out.println("Reversed Circular Linked List:");
        list.reverse();
        list.display(); // Output: 4 3 2 1
    }
}
