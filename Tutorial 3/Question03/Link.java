package Question03;

public class Link {
	public int iData;
	public Link next;
	
	
	public Link(int iData) {
		this.iData=iData;
		this.next=null;
	}
	
	public void displayLink() {
		System.out.print(iData + " ");
	}
	

}
