package Trees;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public int sum(Node node) {
        if (node == null) {
            return 0;
        }
        return node.data + sum(node.left) + sum(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int sum = tree.sum(tree.root);
        System.out.println("Sum of nodes in the binary tree: " + sum);
    }
}
