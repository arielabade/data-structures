package dataStructures.Java.Stack.Code;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(1);

        System.out.println("Initial stack:");
        myStack.printStack();
        System.out.println("--------------------------------------");

        // Push test
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println("After pushing 2, 3, 4:");
        myStack.printStack();
        System.out.println("--------------------------------------");

        // Get top test
        myStack.getTop();
        System.out.println("After getting top element:");
        myStack.printStack();
        System.out.println("--------------------------------------");

        // Get height test
        myStack.getHeight();
        System.out.println("After getting height:");
        myStack.printStack();
        System.out.println("--------------------------------------");

        // Pop test
        System.out.println("Popping element: " + myStack.pop().value);
        System.out.println("After popping:");
        myStack.printStack();
        System.out.println("--------------------------------------");

        // Pop all elements test
        System.out.println("Popping all elements:");
        while (myStack.pop() != null) {
            myStack.printStack();
            System.out.println("--------------------------------------");
        }
    }
}
