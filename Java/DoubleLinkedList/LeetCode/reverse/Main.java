package Java.DoubleLinkedList.LeetCode.reverse;

public class Main {

    public static void main(String[] args) {

        // Caso de teste para reverse
        DoublyLinkedList myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        System.out.println("Antes de reverse:");
        myList.printAll();

        myList.reverse();

        System.out.println("\nDepois de reverse:");
        myList.printAll();
    }
}
