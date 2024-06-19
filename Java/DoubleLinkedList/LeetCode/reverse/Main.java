package Java.DoubleLinkedList.LeetCode.reverse;

public class Main {

    public static void main(String[] args) {

        
        DoublyLinkedList myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        System.out.println("Before everse:");
        myList.printAll();

        myList.reverse();

        System.out.println("\nAfterreverse:");
        myList.printAll();
    }
}
