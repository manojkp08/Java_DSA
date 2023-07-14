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

    // Time Complexity: O(log n) on average (O(n) in the worst case)
    public void insert(int key) {
        root = insertNode(root, key);
    }

    private Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertNode(root.left, key);
        } else if (key > root.data) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    // Time Complexity: O(log n) on average (O(n) in the worst case)
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            minVal = root.left.data;
            root = root.left;
        }
        return minVal;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Search
        Node node = tree.search(tree.root, 40);
        if (node != null) {
            System.out.println("Node found: " + node.data);
        } else {
            System.out.println("Node not found.");
        }

        // Delete
        tree.delete(40);
        node = tree.search(tree.root, 40);
        if (node != null) {
            System.out.println("Node found: " + node.data);
        } else {
            System.out.println("Node not found.");
        }
    }
}
