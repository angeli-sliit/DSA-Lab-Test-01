package Question01;

public class Link {
	public String name;
	public Link next;
	
	public Link(String name) {
		this.name=name;
		this.next=null;
	}
	
	public void displayList() {
		System.out.println(name + " ");
	}

}
