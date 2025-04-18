package Question01;

public class App {
	public static void main(String[] args) {
		Link first;
		
		Link mithilaLink = new Link("Mithila");
		Link AkilaLink = new Link("Akila");
		Link MihiriLink = new Link("Mihiri");
		Link NishaLink = new Link("Nisha");
		
		MihiriLink.next=AkilaLink;
		AkilaLink.next=mithilaLink;
		mithilaLink.next=NishaLink;
		
		first = MihiriLink;
		
		Link currunt = first;
		while(currunt != null) {
			currunt.displayList();
			currunt=currunt.next;
		}
		
		
	}
	

}
