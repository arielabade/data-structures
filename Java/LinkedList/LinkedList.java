
package Java.LinkedList;


public class LinkedList {
    
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

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length " + tail.value);
    }
    
    
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("------ ITEMS --------");
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode; //makes head point to the new node
            tail = newNode; //makes tail point to the new node
        } else {
            tail.next = newNode;
            tail = newNode; //this makes a recursive call
        }

        length++;

    }

    public Node removeLast() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        Node last = head;

        while (temp.next != null) {
            last = temp;
            temp = temp.next;
        }

        tail = last;
        tail.next = null;
        length--; //garbage collector takes out here

        if (length == 0) {
            head = null;
            tail = null;
        } //this is a prevent measure, based on pile execution

        return temp; //temp points out to head

    }

    public void prepend (int value) {
        Node newNode = new Node (value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public Node removeFrist() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next; //head points to the next
        temp.next = null; //temp is now null, because it was removed
        length--;
        if (length == 0) {
            tail = null; //it prevents bugs in the data strutures
        }
        return temp;
    }






}

