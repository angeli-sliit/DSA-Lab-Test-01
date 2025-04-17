package Q2;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Create a queue and stack of size 10
		QueueX qu = new QueueX(10);
		StackX st = new StackX(10);
		
		// Step 1: Insert 5 characters into the queue
		for(int i=0; i<5; i++) {
			System.out.print("char "+ (i+1) + " : ");
			char x = scan.next().charAt(0);
			qu.insert(x);
		}
		
		//Display original queue values and push them to the stack
		System.out.println("\nBefore :");
		for(int i=0; i<5; i++) {
			char y = qu.remove();           // Remove from front
			st.push(y);                     // Push to stack
			qu.insert(y);                   // Re-insert to maintain original order
			System.out.print(y + " ");
		}
		
		//Pop from stack (reverse order) and insert into queue
		for(int i=0; i<5; i++) {
			char z= st.pop();
			qu.insert(z);
		}
		
		
		 //Display final queue values (original + reversed)
		System.out.println("\nAfter :");
		for(int i=0; i<10; i++) {
			char a = qu.remove();
			System.out.print(a + " ");
		}
		scan.close();
	}

}
