package LinkedList;

// reversing a singly linked list
public class ReverseLL {
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
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original list:");
        list.display(); // Output: 1 2 3 4

        System.out.println("Reversed list:");
        list.reverse();
        list.display(); // Output: 4 3 2 1
    }
}
