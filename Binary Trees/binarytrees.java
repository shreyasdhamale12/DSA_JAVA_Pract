
import java.util.Scanner;

 class binaryTrees {
    binaryTrees(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    private static Node root;
    private void insert(Scanner sc){
        System.out.println("Enter the root node : ");
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc,root);
    }

    private void insert(Scanner sc, Node node) {
        System.out.println("Do you want to insert left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left){
            System.out.println("Enter the value of left " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc,node.left);
        }
        System.out.println("Do you want to insert right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            insert(sc,node.right);
        }
    }
     private void inOrderDisplay(Node node) {
         if (node != null){
             inOrderDisplay(node.left);
             System.out.println(node.value + " ");
             inOrderDisplay(node.right);
         }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binaryTrees tree = new binaryTrees();
        tree.insert(sc);

        System.out.println("In-order traversal of the binary tree:");
        tree.inOrderDisplay(root);
    }


}
