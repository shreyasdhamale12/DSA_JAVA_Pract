class Node {
    int value;
    Node left, right;

    // Constructor to create a new node
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BST {

    // A utility function to insert a new node with the given key
    static Node insert(Node root, int key) {

        // If the tree is empty, return a new node
        if (root == null)
            return new Node(key);

        // If the key is already present in the tree, return the node
        if (root.value == key)
            return root;

        // Otherwise, recur down the tree
        if (key < root.value)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    // A utility function to do inorder tree traversal
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    static Node search(Node root, int value){
        if(root == null || root.value == value ){
            return root;
        }

        if (value > root.value){
            return search(root.right,value);
        }
        return search(root.left,value);

    }

    // Driver method (this is where program execution begins)
    public static void main(String[] args) {
        Node root = null;

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);
        System.out.println(search(root,20) != null?"Found":"Not Found");

        // Print inorder traversal of the BST
        inorder(root);  // Output will be: 20 30 40 50 60 70 80
    }
}
