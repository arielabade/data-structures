package Java.DoubleLinkedList.Code;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList myLinkedList = new DoubleLinkedList(1);

        System.out.println("Initial list:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Append test
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        System.out.println("After appending 2, 3, 4:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Prepend test
        myLinkedList.prepend(0);
        System.out.println("After prepending 0:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Remove first test
        System.out.println("Removing first element: " + myLinkedList.removeFirst().value);
        System.out.println("After removing first:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Remove last test
        System.out.println("Removing last element: " + myLinkedList.removeLast().value);
        System.out.println("After removing last:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Insert test
        myLinkedList.insert(1, 333);
        System.out.println("After inserting 333 at index 1:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Set value test
        myLinkedList.set(0, 32);
        System.out.println("After setting value 32 at index 0:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Get value test
        System.out.println("Value at index 2: " + myLinkedList.get(2).value);
        System.out.println("After getting value at index 2:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");

        // Remove by index test
        System.out.println("Removing element at index 2: " + myLinkedList.remove(2).value);
        System.out.println("After removing element at index 2:");
        myLinkedList.printList();
        System.out.println("--------------------------------------");
    }
}
