package Q5;

public class StackX {
    
    private int top;
    private int[] stackArray;
    private int maxSize;
    
    public StackX(int n) {
        this.maxSize = n;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public int push(int x) {
        if (!isFull()) {
            return stackArray[++top] = x;
        } else {
            System.out.println("Stack is full... Cannot push " + x);
            return -1;
        }
    }
    
    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is Empty... Cannot pop");
            return -1;
        }
    }
    
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is Empty... Cannot peek");
            return -1;
        }
    }
}
