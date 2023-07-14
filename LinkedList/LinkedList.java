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
    public static void main(String args[]) {
        Node head = new Node(10);
        Node tmp1 = new Node(20);
        Node tmp2 = new Node(30);
        Node tmp3 = new Node(40);

        // references
        head.next = tmp1;
        tmp1.next = tmp2;
        tmp2.next = tmp3;

        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}