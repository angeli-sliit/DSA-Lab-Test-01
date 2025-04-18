package Q3;

import java.util.Scanner;

public class SortQueue {
	
public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    QueueX queueX = new  QueueX(20);
		StackX stackX = new StackX(20);
	    
	    int x;
	    System.out.println("enter numbers(-1 to stop): ");
	    x = scan.nextInt();
	    while(x!=-1){
	    	queueX.insert(x);
	    	x = scan.nextInt();
	    }
	    
	    
	    while(!queueX.isEmpty()) {
	    	int temp = queueX.remove();
	    	while (!stackX.isEmpty() && stackX.peek() < temp) {
	            queueX.insert(stackX.pop());
	        }

	        stackX.push(temp);
	    }
	    
	    
	    while (!stackX.isEmpty()) {
            queueX.insert(stackX.pop());
        }

	    System.out.print("Sorted Queue (Ascending): ");
	    while (!queueX.isEmpty()) {
	        System.out.print(queueX.remove() + " ");
	    }

        scan.close();
	}
}



//	🧪 Let's walk through an example input:


//		Input: 3, 1, 4, 2


//		Initially:
//		Queue: [3, 1, 4, 2]
//		Stack: []



// 	🔁 Loop Iteration 1:
//		temp = queueX.remove(); // 3
//		Stack is empty → push 3.
//
//	Now:
//		Queue: [1, 4, 2]
//		Stack: [3]




//	🔁 Loop Iteration 2:
//		temp = 1;
//		while (!stackX.isEmpty() && stackX.peek() < temp) // 3 < 1? ❌
//		Condition fails → push 1 directly into stack.
//
//	Now:
//		Queue: [4, 2]
//		Stack (Top → Bottom): [1, 3]
//		(⚠️ Notice: The stack is building in reverse order — smallest values on top)




//🔁 Loop Iteration 3:


//		temp = 4;
//		stackX.peek() < 4 → 1 < 4 ✅ → pop 1, insert back into queue
//		stackX.peek() < 4 → 3 < 4 ✅ → pop 3, insert back into queue
//		stackX is now empty → push 4

//	Now:
//		Queue: [2, 1, 3]
//		Stack: [4]




//	🔁 Loop Iteration 4:


//	temp = 2;
//	stackX.peek() < 2 → 4 < 2? ❌ → push 2

//	Now:
//		Queue: [1, 3]
//		Stack (Top → Bottom): [2, 4]




//	🔁 Loop Iteration 5:
//		temp = 1;
//		stackX.peek() < 1 → 2 < 1? ❌ → push 1
//	Now:
//		Queue: [3]
//		Stack (Top → Bottom): [1, 2, 4]



//	🔁 Loop Iteration 6:
//		temp = 3;
//		stackX.peek() < 3 → 1 < 3 ✅ → pop 1 → queue
//		stackX.peek() < 3 → 2 < 3 ✅ → pop 2 → queue
//		stackX.peek() < 3 → 4 < 3? ❌ → push 3
//	Now:
//		Queue: [1, 2]
//		Stack (Top → Bottom): [3, 4]
//		Final Queue: [1, 2]
//		You continue this process and eventually empty the queue.
//



//	✅ Final Stack (After All Moves):
//  Once the queue is fully processed, stack will look like this:

//  Top → Bottom: [1, 2, 3, 4]
//  Then you pop from the stack back into the queue to reverse it to:

//	Queue: 1, 2, 3, 4 (Sorted)
	    
	    	

