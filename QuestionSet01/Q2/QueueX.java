package Q2;

public class QueueX {
    private char[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    // Constructor
    public QueueX(int size) {
        maxSize = size;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    
    public boolean isEmpty() {
        return (nItems == 0);
    }

    
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // Insert
    public void insert(char value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add: " + value);
        } else {
            
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
        }
    }

    // Remove 
    public char remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return '\0'; 
        } else {
            char temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    // Peek
    public char peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return '\0';
        }
        return queueArray[front];
    }
}
