package LabExercise3;


public class App {
	public static void main(String[] args) {
		
		//a. ii
		Link nipuna = new Link("Nipuna", 53.5);
		Link aravinda = new Link("Aravinda", 78.0);
		Link prashani = new Link("Prashani", 69.5);
		
		
		//a. iii
		nipuna.next=aravinda;
		aravinda.next=prashani;
		
		Link currunt = nipuna;
		
		while(currunt != null) {
			currunt.displayDetails();
			currunt=currunt.next;
		}
		
		
		
		//b.ii
		System.out.println("\n\n");
		LinkList linkList = new LinkList();
		
		linkList.insertFirst("Prashani", 69.5);
		linkList.insertFirst("Aravinda", 78.0);
		linkList.insertFirst("Nipuna", 53.5);
		
		linkList.displayList();
		
		
		//b.iii
		System.out.println("\n\n");
		linkList.insertFirst("Angeli", 80.5);
		linkList.insertFirst("Tharushika", 75.0);
		linkList.displayList();
		
		
		//c. ii
		System.out.println("\n\n");
		linkList.deleteLink("Tharushika");
		linkList.deleteLink("Aravinda");
		linkList.displayList();
		
		
	}
}
