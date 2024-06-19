package Java.DoubleLinkedList.LeetCode.swapFirstAndLast;

public class Main {

    public static void main(String[] args) {

        // Caso de teste para swapFirstLast
        DoublyLinkedList myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        System.out.println("Before swapFirstLast:");
        myList.printAll();

        myList.swapFirstLast();

        System.out.println("\nAfter swapFirstLast:");
        myList.printAll();
    }
}
