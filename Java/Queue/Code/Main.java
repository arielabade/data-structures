package dataStructures.Java.Queue.Code;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(1);

        System.out.println("Initial queue:");
        myQueue.printQueue();
        System.out.println("--------------------------------------");

        // Enqueue test
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        System.out.println("After enqueuing 2, 3, 4:");
        myQueue.printQueue();
        System.out.println("--------------------------------------");

        // Get first test
        myQueue.getFirst();
        System.out.println("After getting first element:");
        myQueue.printQueue();
        System.out.println("--------------------------------------");

        // Get last test
        myQueue.getLast();
        System.out.println("After getting last element:");
        myQueue.printQueue();
        System.out.println("--------------------------------------");

        // Get length test
        myQueue.getLength();
        System.out.println("After getting length:");
        myQueue.printQueue();
        System.out.println("--------------------------------------");

        // Dequeue test
        System.out.println("Dequeuing element: " + myQueue.dequeue().value);
        System.out.println("After dequeuing:");
        myQueue.printQueue();
        System.out.println("--------------------------------------");

        // Dequeue all elements test
        System.out.println("Dequeuing all elements:");
        while (myQueue.dequeue() != null) {
            myQueue.printQueue();
            System.out.println("--------------------------------------");
        }
    }
}
