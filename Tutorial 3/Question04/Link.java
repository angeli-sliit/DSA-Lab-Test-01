package Question04;

public class Link {
	public int id;
	public Link next;
	
	public Link(int id) {
		this.id=id;
		this.next=null;
	}
	
	public void displayList() {
		System.out.println(id + " ");
	}

}
