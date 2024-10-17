
// Implement a Stack Using Arrays
public class ArrayStack {
    private final int maxSize; // Maximum size of the stack
    private final int[] stackArray; // Array to store stack elements
    private int top; // Index of the top element in the stack

    // Constructor to initialize the stack
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1; // Initialize top as -1 to indicate an empty stack
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push element " + element + ".");
            return;
        }
        stackArray[++top] = element; // Increment top and insert the element at the new top index
        System.out.println("Pushed element " + element + " onto the stack.");
    }

    // Method to pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
            return -1; // Return -1 to indicate stack underflow
        }
        int poppedElement = stackArray[top--]; // Get the element at the top index and decrement top
        System.out.println("Popped element " + poppedElement + " from the stack.");
        return poppedElement; // Return the popped element
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1; // Return -1 to indicate an empty stack
        }
        return stackArray[top]; // Return the element at the top index
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5); // Create a stack with a maximum size of 5
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // Trying to push onto a full stack
        System.out.println("Top element of the stack: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    }
}