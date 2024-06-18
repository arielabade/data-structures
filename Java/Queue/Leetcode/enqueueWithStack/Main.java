

package Java.Queue.Leetcode.enqueueWithStack;

public class Main {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        
        // Test enqueue operation
        queue.enqueue(1);
        System.out.println("Peek after enqueue 1: " + queue.peek()); // Expected: 1
        
        queue.enqueue(2);
        System.out.println("Peek after enqueue 2: " + queue.peek()); // Expected: 1
        
        queue.enqueue(3);
        System.out.println("Peek after enqueue 3: " + queue.peek()); // Expected: 1
        
        queue.enqueue(4);
        System.out.println("Peek after enqueue 4: " + queue.peek()); // Expected: 1
        
        queue.enqueue(5);
        System.out.println("Peek after enqueue 5: " + queue.peek()); // Expected: 1
        
        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: false
    }
}
