package Binary_Search_Tree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Time Complexity: O(log n) on average (O(n) in the worst case)
    public Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        Node node = tree.search(tree.root, 40);
        if (node != null) {
            System.out.println("Node found: " + node.data);
        } else {
            System.out.println("Node not found.");
        }
    }
}
