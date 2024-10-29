class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class DeleteNodeExample {

    // Method to delete a node with the specified key
    TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null; // Base case: if tree is empty
        }

        // Recursively find the node to delete
        if (key < root.val) {
            root.left = deleteNode(root.left, key); // Go left
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // Go right
        } else {
            // Node with the key found
            return helper(root); // Call helper to handle the deletion
        }
        return root; // Return the (possibly unchanged) root pointer
    }

    // Helper function to handle deletion cases
    TreeNode helper(TreeNode root) {
        // Case 1: No right child
        if (root.right == null) {
            return root.left; // Return left subtree
        }
        // Case 2: No left child
        if (root.left == null) {
            return root.right; // Return right subtree
        }
        // Case 3: Node with two children
        TreeNode lastRight = findLastRight(root.left);
        lastRight.right = root.right;
        return root.left;
    }


    TreeNode findLastRight(TreeNode root) {
        if (root.right == null) {
            return root;
        }
        return findLastRight(root.right);
    }

    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        DeleteNodeExample tree = new DeleteNodeExample();

        // Creating a sample BST
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(7);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(13);
        root.right.left.right = new TreeNode(11);

        System.out.println("In-order traversal before deletion:");
        tree.inOrder(root);
        System.out.println();

        // Deleting a node with key 5
        root = tree.deleteNode(root, 5);

        System.out.println("In-order traversal after deletion:");
        tree.inOrder(root);
        System.out.println();
    }
}
