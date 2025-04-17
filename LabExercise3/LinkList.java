package LabExercise3;


// b  i.
public class LinkList {
	public Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null; 
	}
	
	public void insertFirst(String name, double average) {
		Link newLink = new Link(name, average);
		newLink.next=first;
		first=newLink;

	}
	
	
	public Link deleteFirst() {
		if(isEmpty()) {
			return null;
		}
		else {
			Link temp = first;
			first=first.next;
			return temp;
		}

	}
	
	
	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.displayDetails();
			current = current.next;
		}

	}
	
	//c i.
	public Link deleteLink(String name) {
		Link current  = first;
		Link previous = null;
		
		while(current  != null) {
			if(current .name.equals(name)) {
				if(previous == null) {
					first=current .next;                // deleting the first node
				}
				else {
					previous.next=current .next;        // deletting middle or last node
				}
				return current ;                        
			}
			previous=current ;
			current =current .next;
		}
		return null;                                   // not found
	}

}
