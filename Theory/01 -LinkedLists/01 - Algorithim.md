
# Data Structure Creation

```
   
    //node declaration
      
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;
   
    //initialize linked list
    public LinkedList(int value) { 
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1; 
    }
```

Node Class: Defines the structure of a node with a value and a reference to the next node.

LinkedList Class: Manages the linked list with references to the head, tail, and keeps track of the length of the list.

Constructor: Initializes the linked list with a single node. This node is both the head and the tail of the list, and the length of the list is set to 1.




# Linked List Operations

## Append

### Append at the End
- **Case**: Adding a new node to the end of the list.
- **Steps**:
  1. Create a new node.
  2. Set the `next` of the current tail to the new node.
  3. Update the tail to be the new node.
  4. Increment the length of the list.

### Prepend (Append at the Beginning)
- **Case**: Adding a new node to the beginning of the list.
- **Steps**:
  1. Create a new node.
  2. Set the `next` of the new node to the current head.
  3. Update the head to be the new node.
  4. If the list was empty, update the tail to be the new node.
  5. Increment the length of the list.

### Insert (Insert in the Middle)
- **Case**: Adding a new node at a specific position in the list.
- **Steps**:
  1. Create a new node.
  2. Traverse to the node just before the desired position.
  3. Set the `next` of the new node to the `next` of the current node.
  4. Set the `next` of the current node to the new node.
  5. Increment the length of the list.

## Remove

### Two or More Items
- **Case**: Removing a node from a list with two or more items.
- **Steps**:
  1. Traverse to the node just before the node to be removed.
  2. Set the `next` of the current node to the `next` of the node to be removed.
  3. If the node to be removed is the tail, update the tail to be the current node.
  4. Decrement the length of the list.

### If It Does Not Have Any Items
- **Case**: Attempting to remove a node from an empty list.
- **Steps**:
  1. Check if the list is empty.
  2. If it is, return an appropriate message or handle the operation gracefully.

## Search

### Search for an Item
- **Case**: Finding a node with a specific value in the list.
- **Steps**:
  1. Start from the head of the list.
  2. Traverse through each node, comparing the node's value with the target value.
  3. If a node with the target value is found, return the node.
  4. If the end of the list is reached without finding the value, return an appropriate message or value (e.g., null).
