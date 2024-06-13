package Java.LinkedList.Leetcode.HasLoop;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        // Manually create a loop for testing
        myLinkedList.getTail().next = myLinkedList.getHead().next; // Creating a loop in the list

        System.out.println("Has loop: " + hasLoop(myLinkedList));
    }

    public static boolean hasLoop(LinkedList list) {
        LinkedList.Node slow = list.getHead();
        LinkedList.Node fast = list.getHead();

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
