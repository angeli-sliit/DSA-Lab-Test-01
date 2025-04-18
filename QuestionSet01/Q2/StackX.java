package Q2;

public class StackX {
	
	private int top;
	private char[] stackArray;
	private int maxSize;
	
	public StackX( int n ) {
		this.maxSize = n;
		this.top= -1;
		this.stackArray = new char[maxSize];
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
	public char push(char x) {
		if(!isFull()) {
			return stackArray[++top]=x;
		}else {
			System.out.println("Stack is full... Cannot push "+ x);
			return 0;
		}
	}
	
	public char pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		}else {
			System.out.println("Stack is Empty... Cannot pop ");
			return 0;
		}
	}
	
	public char peek() {
		if(!isEmpty()) {
			return stackArray[top];
		}
		else {
			System.out.println("Stack is Empty... Cannot peek ");
			return 0;
		}
	}

}
