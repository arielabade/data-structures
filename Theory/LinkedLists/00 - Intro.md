
# Linked Lists

A linked list is like an array, the differenca between a linked list and a array is that  you **CAN NOT** jump directly to a particular item. 

Also, a linked list have two pointers: a head, and a tail.

And the nodes (memory spaces that store values) have pointers to the subsequent node, in one single direction.

You can insert and delete variables in the beginning, middle, or the end of the list.


## Big O

The worst case scenario with the Big O notation in linked list is **O(n)**.
### Insert

To insert elements at the begining you need only to move the head. The big O notation for this operation is **O(1).**

To insert elements at the middle you need to go through the entire list, until it reaches the element you want to move. The big O notation for this operation is **O(n).**

To insert element at the end of the list,  you need to go through the entire list, and adjust its tail. The big O notation is **O(n).**

### Delet

The operations in delet are equivalent to insert. The big O notation remains the same.

### Search

You can not search with an index on a linked list.

it is needed to go through the entire list, until it reaches the element you wnat to remove. The big O notation for this operation is **O(n).**

This is when an array list is better than a linked list. Because in a array list, you can reach out the element by index.


# Advantages

- Inserting at the begining.
- Inserting at the end.
- Dinamic memory alocation.


# Disadvantages

- Can not look up by index.

