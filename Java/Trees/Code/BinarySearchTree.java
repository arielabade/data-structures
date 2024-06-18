package Java.Trees.Code;

public class BinarySearchTree {

    public Node root;

    class Node { //here, you define the type and what you want the node to be
        int value;
        Node left;
        Node right;

        private Node(int value) { //node initialization
            this.value = value; //oop
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true; //done
        }

        Node temp = root;
        while (true) {  //the stop condition is the node to be true
            if (newNode.value == temp.value) return false; // if the value already exists in the three, does not add it.
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left; //goes to the leftiest node in the tree 
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right; //goest to the rightest node in the trree
            }    
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false; //only returns false if it the value does not appear
    }

    public boolean remove(int value) {
        if (root == null) return false;

        Node temp = root;
        Node parent = null;

        while (temp != null && temp.value != value) {
            parent = temp;
            if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        if (temp == null) return false;

        // Case 1: Node to be deleted has no children (leaf node)
        if (temp.left == null && temp.right == null) {
            if (temp == root) {
                root = null;
            } else if (parent.left == temp) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        // Case 2: Node to be deleted has one child
        else if (temp.left == null || temp.right == null) {
            Node child = (temp.left != null) ? temp.left : temp.right;
            if (temp == root) {
                root = child;
            } else if (parent.left == temp) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        }

        // Case 3: Node to be deleted has two children
        else {
            Node successorParent = temp;
            Node successor = temp.right;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            if (successorParent != temp) {
                successorParent.left = successor.right;
                successor.right = temp.right;
            }

            successor.left = temp.left;

            if (temp == root) {
                root = successor;
            } else if (parent.left == temp) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
        }

        return true;
    }

}
