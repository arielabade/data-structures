package Java.Trees.Code;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Test insert
        System.out.println("Inserting 10, 5, 15, 2, 7, 12, 20 into the BST:");
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(12);
        bst.insert(20);
        printTree(bst.root);
        System.out.println("--------------------------------------");

        // Test contains
        System.out.println("Checking if BST contains 7: " + bst.contains(7));
        System.out.println("Checking if BST contains 3: " + bst.contains(3));
        System.out.println("--------------------------------------");

        // Test remove leaf node
        System.out.println("Removing leaf node 2:");
        bst.remove(2);
        printTree(bst.root);
        System.out.println("--------------------------------------");

        // Test remove node with one child
        System.out.println("Removing node with one child 15:");
        bst.remove(15);
        printTree(bst.root);
        System.out.println("--------------------------------------");

        // Test remove node with two children
        System.out.println("Removing node with two children 5:");
        bst.remove(5);
        printTree(bst.root);
        System.out.println("--------------------------------------");

        // Test remove root node
        System.out.println("Removing root node 10:");
        bst.remove(10);
        printTree(bst.root);
        System.out.println("--------------------------------------");

        // Test remove all elements
        System.out.println("Removing all elements:");
        bst.remove(7);
        bst.remove(12);
        bst.remove(20);
        printTree(bst.root);
        System.out.println("--------------------------------------");
    }

    public static void printTree(BinarySearchTree.Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.value + " ");
            printTree(node.right);
        }
    }
}
