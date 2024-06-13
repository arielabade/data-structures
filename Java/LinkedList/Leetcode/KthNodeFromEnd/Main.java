package Java.LinkedList.Leetcode.KthNodeFromEnd;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        LinkedList.Node kthFromEnd = myLinkedList.findKthFromEnd(k);

        if (kthFromEnd != null) {
            System.out.println("The " + k + "-th node from the end is: " + kthFromEnd.value);
        } else {
            System.out.println("The list is shorter than " + k + " elements.");
        }
    }
}
