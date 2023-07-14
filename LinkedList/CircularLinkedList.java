package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

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
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        size++;
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

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Circular Linked List:");
        list.display(); // Output: 1 2 3

        System.out.println("Size of the list: " + list.getSize()); // Output: 3
    }
}
