package Java.DoubleLinkedList.Code;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int length;
    
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoubleLinkedList(int value) {
        Node newNode = new Node (value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append (int value)  { //the differene from a linked list is that it contains a "prev" pointer
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode; //remember these are only pointers, so they can point to anywhere
        } else {
            tail.next = newNode; //the "next" pointer of the last element of the double linked list points out to the new appended elements
            newNode.prev = tail; //the appended element "prev" pointer points out to the last element of the list;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {

        //first case of failure
        if(length == 0) return null;

        Node temp;
        temp = tail; //auxiliary pointer points out to the same memory region where tail is located
        tail = tail.prev; //slide the pointers between the numbers
        tail.next = null;
        temp.prev = null;
        length--;

        //second case of failure
        if (length == 0) { //deals with memory garbage collector
            head = null;
            tail = null;
        }
        
        return temp;

    }

    public void prepend(int value) {

        Node newNode = new Node(value); //©rete and manipulating pointers is different from creating nodes itself

        if(length == 0) {
            head = newNode;
            tail = newNode;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public Node removeFirst() {

        if (length == 0) return null;
        
        Node temp;
        temp = head; //temp is the node which will be deleted
        head = head.next; //jump to the next node
        head.prev = null; 
        temp.next = null;
        length--;

        if (length == 1) {
            head = null;
            tail = null;
        }

        return temp;

    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length " + tail.value);
    }
    

}
