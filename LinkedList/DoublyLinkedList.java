package LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

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

        size++;
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

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Doubly Linked List (Forward):");
        list.displayForward(); // Output: 1 2 3

        System.out.println("Doubly Linked List (Backward):");
        list.displayBackward(); // Output: 3 2 1

        System.out.println("Size of the list: " + list.getSize()); // Output: 3
    }
}
