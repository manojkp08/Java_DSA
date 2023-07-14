package LinkedList;

public class ReverseRecLL {
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

    public Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node reversedList = reverse(node.next);
        node.next.next = node;
        node.next = null;

        return reversedList;
    }

    public void reverse() {
        head = reverse(head);
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
        ReverseRecLL list = new ReverseRecLL();

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
