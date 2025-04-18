package Question03;

public class App {
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		
		linkList.insertFirst(14);
		linkList.insertFirst(34);
		linkList.insertFirst(12);
		linkList.insertFirst(43);
		linkList.insertFirst(23);
		
		linkList.displayLinkList();
		
		linkList.insertAfter(12, 1);
		linkList.displayLinkList();
		
		linkList.delete(34);
		linkList.displayLinkList();
	}

}
