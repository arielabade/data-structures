package dataStructures.Java.LinkedList.Code;

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

    public Node removeFirst() {
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

    public Node get (int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (length == 0) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp; //retorne o valor alocado

    }

    public boolean set (int index, int value) { //reusing code
       Node temp = get(index);
       if (temp != null) {
        temp.value = value;
        return true;
       }

       return false; //if the codition is not satisfied, it does not pass


    }
    

    public boolean insert (int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend (value); // adds the element in the beginning of the list
            return true;
        }

        if (index == length) {
            append(value); // adds the element in the end of the list
            return true;
        }

        Node newNode = new Node (value);
        Node temp = get(index - 1);
        newNode.next = temp.next; //the most important part, pointer correction. Point the new node to where the "temp" pointer was pointing out
        temp.next = newNode; 
        length++;
        return true;
    }

    public Node remove (int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst(); //you can return it because its a NODE
        if(index == length - 1) return removeLast();

        Node prev = get (index - 1);
        Node temp = prev.next;

        prev.next = temp.next; //adjusts the anterior pointer to the next pointer, most important part
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp; //tail = temp = head  //list inversion by transitivity
        Node after = temp.next; //advances on the next node
        Node before = null; //the node before points out to nothing
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }



}

