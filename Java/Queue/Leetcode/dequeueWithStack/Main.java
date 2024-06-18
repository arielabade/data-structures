package Java.Queue.Leetcode.dequeueWithStack;

public class Main {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        
        // Test enqueue operation
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        
        // Test dequeue operation
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 1
        System.out.println("Peek after dequeue: " + queue.peek()); // Expected: 2
        
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 2
        System.out.println("Peek after dequeue: " + queue.peek()); // Expected: 3
        
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 3
        System.out.println("Peek after dequeue: " + queue.peek()); // Expected: 4
        
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 4
        System.out.println("Peek after dequeue: " + queue.peek()); // Expected: 5
        
        System.out.println("Dequeue: " + queue.dequeue()); // Expected: 5
        
        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: true
        
        // Dequeue from empty queue
        System.out.println("Dequeue from empty queue: " + queue.dequeue()); // Expected: null
    }
}
