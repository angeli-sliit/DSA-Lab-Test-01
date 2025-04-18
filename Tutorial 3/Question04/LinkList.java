package Question04;

public class LinkList {
	public Link first;
	
	public LinkList() {
		first= null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	// Adds a new link to the front of the list
	public void addFirst(int ID) {
		Link newLink = new Link(ID);
		newLink.next=first;
		first=newLink;
	}
	
	 // Removes and returns the ID of the first link
	public int removeFirst() {
		if (!isEmpty()) {
            int ID = first.id;
            first = first.next;
            return ID;
        } else {
            System.out.println("List is empty.");
            return -1;
        }
    }
	
	//Part (i)
	// Deletes all links and prints their IDs
    public void deleteAllLinks() {
        while (!isEmpty()) {
            int deletedID = removeFirst();
            System.out.println("Deleted: " + deletedID);
        }
    }

    //Part (iii)
    // Deletes all links except the last one
    public void deleteAllExceptLast() {
        while (first != null && first.next != null) {
            int deletedID = removeFirst();
            System.out.println("Deleted: " + deletedID);
        }
    }
    
    public void displayList() {
		Link current = first;
		
		while(current != null){
			current.displayList();
			current=current.next;
		}
		 System.out.println();
	}
}
