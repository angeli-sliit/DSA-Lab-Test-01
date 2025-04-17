package Q1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Create a queue and stack of size 5
		QueueX q = new QueueX(5);
		StackX s = new StackX(5);
		
		// Add characters in ascending order to the queue
		System.out.println("add charecter : ");
		for(int i=0; i<5; i++) {
			System.out.print("char "+ (i+1) + " : ");
			char x= scan.next().charAt(0);
			q.insert(x); 
		}
		
		
		//  Remove items from queue and push to stack
		// Display ascending order (original input)
		System.out.println("\nBefore :");
		for(int i=0; i<5; i++) {
			char x= q.remove();                // Remove from queue
			System.out.print(x + " ");
			s.push(x);                         // Push to stack
		}
		
		
		// Pop items from stack and insert back to queue
		// This makes them in descending order
		System.out.println("\nAfter :");
		for(int i=0; i<5; i++) {
			char y = s.pop();                // Pop from stack (reverse order)
			q.insert(y);                     // Insert back to queue
			
		}
		
		
		//Display the final queue (descending order)
		for(int i=0; i<5; i++) {
		    char y = q.remove();
		    System.out.print(y + " ");
		}
		scan.close();
	}
}