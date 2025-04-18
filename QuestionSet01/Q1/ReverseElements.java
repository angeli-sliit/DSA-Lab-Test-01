package Q1;

public class ReverseElements {

	public static void main(String[] args) {
		
		QueueX queueX = new  QueueX(4);
		StackX stackX = new StackX(4);
		
		queueX.insert('A');
		queueX.insert('B');
		queueX.insert('C');
		queueX.insert('D');
		
		System.out.println("Before : ");
		for(int i=0; i<4; i++) {
			char x= queueX.remove();
			stackX.push(x);
			System.out.print(x + " ");
		}
		

		for(int i=0; i<4; i++) {
			char x= stackX.pop();
			queueX.insert(x);
		}
		
		System.out.println("\n\nAfter : ");
		for(int i=0; i<4; i++) {
			char x= queueX.remove();
			System.out.print(x + " ");
		}
	}

}
