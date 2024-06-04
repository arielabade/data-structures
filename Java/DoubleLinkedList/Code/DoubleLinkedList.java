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

    //optmized get
    public Node get (int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for(int i = 0; i < index; i++) {
                temp = temp.next; // starts the search from the beginning of the list
            } 
            
        } else {
                temp = tail;
                for (int i = length -1; i > index; i--) { //iteration from backwards
                    temp = temp.prev;
                }
            }

            return temp;
        }

    public boolean set(int index, int value) {
        Node temp = get(index); //the difference on how this works is because of the get method
        if(temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    
    public boolean insert(int index, int value) {

        if(index < 0 || index > length) return false;

        if(index == 0) {
            prepend(value);
            return true;
        }

        if(index == 0) {
            append(value);
            return true;
        }

        Node newNode = new Node (value);
        Node before = get(index-1); //opening spaces
        Node after = before.next; //opening spaces

        newNode.prev = before; //first pointer
        newNode.next = after; //second pointer
        before.next = newNode; //third pointer
        after.prev = newNode;  //fourth pointer
        length++;
        return true; 
        
    }

    public Node remove (int index) {

        if(index < 0 | index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length -1) return removeLast();

	    Node currentNode = get(index);
	    Node previousNode = currentNode.prev;
	    Node nextNode = currentNode.next;
	    
	    previousNode.next = nextNode; //extremely more readble
	    nextNode.prev = previousNode;
	    previousNode.next = null;
	    previousNode.prev = null;
        length--;

        return currentNode; 
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
