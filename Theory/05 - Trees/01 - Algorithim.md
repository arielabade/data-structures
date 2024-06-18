# Trees

# Tree Definition

A tree is a hierarchical data structure consisting of nodes, where each node has a value and a list of references to child nodes. A tree has the following properties:

- **Root**: The topmost node of the tree, which has no parent.
- **Parent**: A node that has one or more child nodes.
- **Child**: A node that has a parent node.
- **Leaf**: A node that has no children, also known as a terminal node.
- **Subtree**: A tree formed by a node and all its descendants.
- **Edge**: A connection between two nodes.
- **Height**: The length of the longest path from the root to a leaf.
- **Depth**: The length of the path from the root to a node.
- **Level**: The number of edges on the path from the root to the node, where the root node is at level 0.

## Characteristics of Trees

- **Acyclic**: Trees do not contain cycles.
- **Connected**: There is exactly one path between any two nodes.

## Types of Trees

- **Binary Tree**: Each node has at most two children, referred to as the left child and the right child.
- **Binary Search Tree (BST)**: A binary tree where for each node, the values of all the nodes in the left subtree are less than the node's value, and the values of all the nodes in the right subtree are greater.
- **Balanced Tree**: A tree where the height of the left and right subtrees of any node differ by at most one.
- **Complete Binary Tree**: A binary tree in which all levels are fully filled except possibly for the last level, which is filled from left to right.
- **Full Binary Tree**: A binary tree where every node has either 0 or 2 children.
- **AVL Tree**: A self-balancing binary search tree where the difference in heights of the left and right subtrees is at most one for all nodes.
- **Red-Black Tree**: A self-balancing binary search tree where each node contains an extra bit for denoting the color of the node, either red or black.



## Data Structure Creation

### Node Class
The `Node` class defines the structure of a node within the binary search tree. Each node contains:
- `int value`: The value stored in the node.
- `Node left`: A reference to the left child node.
- `Node right`: A reference to the right child node.

### BinarySearchTree Class
The `BinarySearchTree` class manages the binary search tree and includes methods for inserting, searching, and removing nodes. The tree is initialized with a root node.

```java
package Java.Trees.Code;

public class BinarySearchTree {

    public Node root;

    class Node { // Defines the structure of the node
        int value;
        Node left;
        Node right;

        private Node(int value) { // Node initialization
            this.value = value;
        }
    }

    // Initialize the tree with a root node
    public BinarySearchTree(int value) {
        root = new Node(value);
    }
}
```

## Binary Search Tree Operations

### Insert
The `insert` method adds a new node with a specified value to the tree. The method ensures that the tree maintains its binary search property, where the left child contains values less than the parent node and the right child contains values greater than the parent node.

```java
public boolean insert(int value) {
    Node newNode = new Node(value);
    if (root == null) {
        root = newNode;
        return true;
    }

    Node temp = root;
    while (true) {
        if (newNode.value == temp.value) return false; // Value already exists
        if (newNode.value < temp.value) {
            if (temp.left == null) {
                temp.left = newNode;
                return true;
            }
            temp = temp.left;
        } else {
            if (temp.right == null) {
                temp.right = newNode;
                return true;
            }
            temp = temp.right;
        }
    }
}
```

### Search
The `contains` method checks whether a node with the specified value exists in the tree. It traverses the tree, comparing the target value to the current node's value, moving left or right accordingly.

```java
public boolean contains(int value) {
    Node temp = root;
    while (temp != null) {
        if (value < temp.value) {
            temp = temp.left;
        } else if (value > temp.value) {
            temp = temp.right;
        } else {
            return true; // Value found
        }
    }
    return false; // Value not found
}
```

### Remove
The `remove` method deletes a node with the specified value from the tree. It handles three cases:
1. **Node to be deleted has no children**: Simply remove the node.
2. **Node to be deleted has one child**: Replace the node with its child.
3. **Node to be deleted has two children**: Find the in-order successor (the smallest value in the right subtree), replace the node's value with the successor's value, and remove the successor.

```java
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
```

This code provides a basic implementation of a binary search tree with methods for inserting, searching, and removing nodes, ensuring that the tree maintains its binary search property.