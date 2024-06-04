Sure, I'll update the document to refer specifically to "doubly linked lists" and provide examples based on the code you provided.

# Data Structure Creation

```java
//node declaration

class Node {
    int value;
    Node next;
    Node prev; // added for doubly linked list
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

**Node Class**: Defines the structure of a node with a value, a reference to the next node, and a reference to the previous node.

**DoublyLinkedList Class**: Manages the doubly linked list with references to the head, tail, and keeps track of the length of the list.

**Constructor**: Initializes the doubly linked list with a single node. This node is both the head and the tail of the list, and the length of the list is set to 1.

# Doubly Linked List Operations

## Append

### Append at the End
- **Case**: Adding a new node to the end of the list.
- **Steps**:
  1. Create a new node.
  2. Set the `next` of the current tail to the new node.
  3. Set the `prev` of the new node to the current tail.
  4. Update the tail to be the new node.
  5. Increment the length of the list.

```java
public void append(int value) {
    Node newNode = new Node(value);
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    length++;
}

// Example Usage
public static void main(String[] args) {
    LinkedList list = new LinkedList(1);
    list.append(2);
    list.append(3);
    list.printAll(); // Output: 1 -> 2 -> 3
}
```

### Prepend (Append at the Beginning)
- **Case**: Adding a new node to the beginning of the list.
- **Steps**:
  1. Create a new node.
  2. Set the `next` of the new node to the current head.
  3. Set the `prev` of the current head to the new node.
  4. Update the head to be the new node.
  5. If the list was empty, update the tail to be the new node.
  6. Increment the length of the list.

```java
public void prepend(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
        head = newNode;
        tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    length++;
}

// Example Usage
public static void main(String[] args) {
    LinkedList list = new LinkedList(1);
    list.prepend(0);
    list.printAll(); // Output: 0 -> 1
}
```

### Insert (Insert in the Middle)
- **Case**: Adding a new node at a specific position in the list.
- **Steps**:
  1. Create a new node.
  2. Traverse to the node just before the desired position.
  3. Set the `next` of the new node to the `next` of the current node.
  4. Set the `prev` of the new node to the current node.
  5. Set the `next` of the current node to the new node.
  6. Set the `prev` of the node after the new node to the new node.
  7. Increment the length of the list.

```java
public boolean insert(int index, int value) {
    if (index < 0 || index > length) return false;
    if (index == 0) {
        prepend(value);
        return true;
    }
    if (index == length) {
        append(value);
        return true;
    }
    Node newNode = new Node(value);
    Node temp = get(index - 1);
    newNode.next = temp.next;
    newNode.prev = temp;
    temp.next.prev = newNode;
    temp.next = newNode;
    length++;
    return true;
}

// Example Usage
public static void main(String[] args) {
    LinkedList list = new LinkedList(1);
    list.append(3);
    list.insert(1, 2);
    list.printAll(); // Output: 1 -> 2 -> 3
}
```

## Remove

### Remove from the End
- **Case**: Removing the last node in the list.
- **Steps**:
  1. Check if the list is empty.
  2. If not, traverse to the node just before the tail.
  3. Update the `next` of the previous node to null.
  4. Update the tail to the previous node.
  5. Decrement the length of the list.

```java
public Node removeLast() {
    if (length == 0) return null;
    Node temp = tail;
    if (length == 1) {
        head = null;
        tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }
    length--;
    return temp;
}

// Example Usage
public static void main(String[] args) {
    LinkedList list = new LinkedList(1);
    list.append(2);
    list.append(3);
    list.removeLast();
    list.printAll(); // Output: 1 -> 2
}
```

### Remove from the Beginning
- **Case**: Removing the first node in the list.
- **Steps**:
  1. Check if the list is empty.
  2. If not, update the head to the next node.
  3. Set the `prev` of the new head to null.
  4. Decrement the length of the list.

```java
public Node removeFirst() {
    if (length == 0) return null;
    Node temp = head;
    if (length == 1) {
        head = null;
        tail = null;
    } else {
        head = head.next;
        head.prev = null;
        temp.next = null;
    }
    length--;
    return temp;
}

// Example Usage
public static void main(String[] args) {
    LinkedList list = new LinkedList(1);
    list.append(2);
    list.append(3);
    list.removeFirst();
    list.printAll(); // Output: 2 -> 3
}
```

### Remove from the Middle
- **Case**: Removing a node from the middle of the list.
- **Steps**:
  1. Check if the list is empty.
  2. Traverse to the node just before the node to be removed.
  3. Update the `next` of the previous node to the `next` of the node to be removed.
  4. Update the `prev` of the node after the node to be removed to the previous node.
  5. Decrement the length of the list.

```java
public Node remove(int index) {
    if (index < 0 || index >= length) return null;
    if (index == 0) return removeFirst();
    if (index == length - 1) return removeLast();
    Node prev = get(index - 1);
    Node temp = prev.next;
    prev.next = temp.next;
    temp.next.prev = prev;
    temp.next = null;
    temp.prev = null;
    length--;
    return temp;
}

// Example Usage
public static void main(String[] args) {
    LinkedList list = new LinkedList(1);
    list.append(2);
    list.append(3);
    list.remove(1);
    list.printAll(); // Output: 1 -> 3
}
```

## Search

### Search for an Item
- **Case**: Finding a node with a specific value in the list.
- **Steps**:
  1. Start from the head of the list.
  2. Traverse through each node, comparing the node's value with the target value.
  3. If a node with the target value is found, return the node.
  4. If the end of the list is reached without finding the value, return an appropriate message or value (e.g., null).

```java
public Node get(int index) {
    if (index < 0 || index >= length) return null;
    Node temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }
    return temp;
}

// Example Usage
public static void main(String[] args) {
    LinkedList list = new LinkedList(1);
    list.append(2);
    list.append(3);
    Node node = list.get(1);
    if (node != null) {
        System.out.println("Found: " + node.value); // Output: Found: 2
    } else {
        System.out.println("Not Found");
    }
}
```

This format ensures clarity and provides specific examples demonstrating the usage of the doubly linked list operations based on the provided code.