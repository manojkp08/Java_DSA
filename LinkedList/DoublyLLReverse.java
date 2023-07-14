package LinkedList;

public class DoublyLLReverse {
    private Node head;
    private Node tail;

    private static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("The doubly linked list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("The doubly linked list is empty.");
            return;
        }

        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return; // Empty or only one node, no need to reverse
        }

        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev; // Move to the next node
        }

        // Swap head and tail
        Node tempNode = head;
        head = tail;
        tail = tempNode;
    }

    public static void main(String[] args) {
        DoublyLLReverse list = new DoublyLLReverse();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original Doubly Linked List (Forward):");
        list.displayForward(); // Output: 1 2 3 4

        System.out.println("Reversed Doubly Linked List (Forward):");
        list.reverse();
        list.displayForward(); // Output: 4 3 2 1

        System.out.println("Reversed Doubly Linked List (Backward):");
        list.displayBackward(); // Output: 1 2 3 4
    }
}
