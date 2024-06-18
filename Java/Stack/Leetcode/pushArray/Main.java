package Java.Stack.Leetcode.pushArray;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        
        // Test push operation
        stack.push(1);
        System.out.println("Peek after push 1: " + stack.peek()); // Expected: 1
        
        stack.push(2);
        System.out.println("Peek after push 2: " + stack.peek()); // Expected: 2
        
        stack.push(3);
        System.out.println("Peek after push 3: " + stack.peek()); // Expected: 3
        
        stack.push(4);
        System.out.println("Peek after push 4: " + stack.peek()); // Expected: 4
        
        stack.push(5);
        System.out.println("Peek after push 5: " + stack.peek()); // Expected: 5
        
        // Check the size of the stack
        System.out.println("Stack size: " + stack.size()); // Expected: 5
        
        // Print the stack elements
        System.out.println("Stack elements:");
        stack.printStack(); // Expected: 5, 4, 3, 2, 1
        
        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: false
    }
}
