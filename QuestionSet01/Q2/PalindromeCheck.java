package Q2;

import java.util.Scanner;

import Q1.QueueX;
import Q1.StackX;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input : ");
		String string = scan.next();
		
		QueueX queueX = new  QueueX(string.length());
		StackX stackX = new StackX(string.length());
		
		for(int i=0; i<string.length(); i++) {
			char x = string.charAt(i);
			queueX.insert(x);
			stackX.push(x);
		}
		

		boolean isPalindrome = true;
		
		for(int i=0; i<string.length(); i++) {
			char first = queueX.remove();
			char second = stackX.pop();
			
			if(first!=second) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scan.close();
	}

}
