package Question03;

public class LinkList {
	Link first;
	
	public LinkList() {
		this.first=null;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void displayLinkList() {
		Link current = first;
		
		while(current != null){
			current.displayLink();
			current=current.next;
		}
		 System.out.println();
	}
	
	
	
	public boolean insertAfter(int Key, int newData) {
		Link current = first;
		
		while(current != null) {
			if(current.iData == Key) {
				Link newLink = new Link( newData);
				newLink.next=current.next;
				current.next=newLink;
				return true;
			}
			current=current.next;
		}
		return false;
		
	}
	
	

	public boolean delete(int key) {
		Link current = first;
		Link previous = null;
		
		while(current != null) {
			if(current.iData == key) {
				if(previous == null) {
					first = current.next;         // Deleting first node
				}
				else {
					previous.next=current.next;   // Skipping current
				}
				return true;
			}
			previous = current;
			current=current.next;	
		}
		return false;	                         // Key not found
	}
	
	
	public Link find(int key) {
		Link current = first;
		while(current != null) {
			
			if(current.iData == key) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	public void insertFirst(int data) {
	    Link newLink = new Link(data);
	    newLink.next = first;
	    first = newLink;
	}
}



















