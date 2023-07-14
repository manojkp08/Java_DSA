package Trees;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Height {
    int value;
}

class BinaryTree {
    Node root;

    public int diameter(Node node, Height height) {
        if (node == null) {
            height.value = 0;
            return 0;
        }

        Height leftHeight = new Height();
        Height rightHeight = new Height();

        int leftDiameter = diameter(node.left, leftHeight);
        int rightDiameter = diameter(node.right, rightHeight);

        height.value = Math.max(leftHeight.value, rightHeight.value) + 1;

        return Math.max(leftHeight.value + rightHeight.value + 1, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        Height height = new Height();
        int diameter = tree.diameter(tree.root, height);
        System.out.println("Diameter of the binary tree (O(n)): " + diameter);
    }
}

// Time complexity is O(n)