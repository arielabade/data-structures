# Stacks

# Data Structure Creation

```java

 class Node { //define class and the insie method
        int value;
        Node next;
    

    Node(int value) {
        this.value = value;
    }
}
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node (value);
        top = newNode;
        height = 1;
    }


```

The only requirement for a stack to work is to remove and add an item at the same end.

# LIFO (Last In, First Out)

The last element to be added is the first element to be removed.

### Implementation

A stack can be implemented using either an array or a linked list.

- **Array Implementation:** The complexity, in Big O notation, is O(1) if the stack implementation appends the element at the end.

- **Linked List Implementation:** The complexity will also be O(1) as long as the element is appended at the end of the list.
