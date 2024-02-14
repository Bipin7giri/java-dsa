package stacks;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

/**
 * Adds an element to the top of the stack.
 *
 * @param value the value to be added
 * @return true if the element was added, false if the stack is full
 */
public boolean push(int value) {
    if (isFull()) {
        System.out.println("Stack is full. Cannot push element " + value);
        return false;
    }
    stackArray[++top] = value;
    return true;
}  

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        System.out.println("Peek: " + stack.peek());
    }
}
