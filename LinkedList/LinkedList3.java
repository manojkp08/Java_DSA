package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Test {
    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data + " ");
        printList(head.next);
    }

    public static void main(String args[]) {
        Node head = null;
        head = new Node(10);
        head = new Node(20);
        head = new Node(30);

        printList(head);
    }
}
