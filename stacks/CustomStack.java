package stacks;

public class CustomStack {

    private int maxSize;
    private int top;
    private int[] stack;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public boolean isFull() {
        if (this.maxSize - 1 == this.top) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is FUll!!");
            return;
        } else {
            top++;
            stack[this.top] = value;
            System.out.println(value + "added to stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int value = stack[this.top];
            top--;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        CustomStack cs = new CustomStack(5);
        cs.push(10);
        System.out.println(cs.peek());
        cs.push(20);
        cs.pop();
        System.out.println(cs.peek());

    }

}