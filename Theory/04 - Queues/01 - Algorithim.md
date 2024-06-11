# Queues

The only requirement for a queue to work is to remove an item from one end (the front) and add an item to the other end (the rear).

## FIFO (First In, First Out)

The first element to be added is the first element to be removed.

### Implementation

A queue can be implemented using either an array or a linked list.

- **Array Implementation:** The complexity, in Big O notation, is O(1) for both enqueue (add) and dequeue (remove) operations, provided the implementation allows for efficient removal from the front of the array, which might involve shifting elements.

- **Linked List Implementation:** The complexity will also be O(1) for both enqueue and dequeue operations, as elements can be added at the end (rear) and removed from the beginning (front) of the list.