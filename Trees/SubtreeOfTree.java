package Trees;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        if (isSameTree(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Tree 1
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(2);

        // Tree 2
        TreeNode subtree = new TreeNode(4);
        subtree.left = new TreeNode(1);
        subtree.right = new TreeNode(2);

        boolean isSubtree = tree.isSubtree(tree.root, subtree);
        System.out.println("Is Tree 2 a subtree of Tree 1? " + isSubtree);
    }
}
