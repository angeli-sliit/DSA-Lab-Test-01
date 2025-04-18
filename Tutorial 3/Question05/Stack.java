package Question05;

class Link {
    int iData;  
    Link next;  

    public Link(int data) {
        this.iData = data;
        this.next = null;
    }
}

public class Stack {
    private Link top; 

   
    public Stack() {
        top = null;
    }

  
    public void push(int data) {
        Link newLink = new Link(data);    // Create a new link (node)
        newLink.next = top;               // Point the new link to the current top
        top = newLink;                    // Update the top to the new link
    }

  
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty"); 
        } else {
            int val = top.iData;  // Get the value of the top element
            top = top.next;       // Move the top pointer to the next element
            System.out.println("Popped element: " + val);  
        }
    }

  
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");                   // Print message if stack is empty
        } else {
            System.out.println("Top element is: " + top.iData);     // Print the top element
        }
    }

  
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();  //  print 30

        stack.pop();   //  print "Popped element: 30"
        stack.pop();   //  print "Popped element: 20"

        stack.peek();  //  print "Top element is: 10"

        stack.pop();   //  print "Popped element: 10"

        stack.pop();   //  print "Stack Underflow"

        stack.peek();  //  print "Stack is empty"
    }
}
