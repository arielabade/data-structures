package Java.Stack.Leetcode.popArray;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        
        // Test push operation
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        // Test pop operation
        System.out.println("Pop: " + stack.pop()); // Expected: 5
        System.out.println("Peek after pop: " + stack.peek()); // Expected: 4
        
        System.out.println("Pop: " + stack.pop()); // Expected: 4
        System.out.println("Peek after pop: " + stack.peek()); // Expected: 3
        
        System.out.println("Pop: " + stack.pop()); // Expected: 3
        System.out.println("Peek after pop: " + stack.peek()); // Expected: 2
        
        System.out.println("Pop: " + stack.pop()); // Expected: 2
        System.out.println("Peek after pop: " + stack.peek()); // Expected: 1
        
        System.out.println("Pop: " + stack.pop()); // Expected: 1
        
        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: true
        
        // Pop from empty stack
        System.out.println("Pop from empty stack: " + stack.pop()); // Expected: null
    }
}
