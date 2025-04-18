package Question04;

public class App {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        // Adding elements to the list: 70 → 50 → 30 → 10
        list.addFirst(70);
        list.addFirst(50);
        list.addFirst(30);
        list.addFirst(10);

        System.out.println("Initial list:");
        list.displayList();

        // Test deleteAllLinks()
        System.out.println("\nDeleting all links:");
        list.deleteAllLinks();

        
        
        
        
        
        // Add again to test deleteAllExceptLast()
        list.addFirst(70);
        list.addFirst(50);
        list.addFirst(30);
        list.addFirst(10);

        System.out.println("\nList before deleting all except last:");
        list.displayList();

        // Test deleteAllExceptLast()
        System.out.println("\nDeleting all links except the last one:");
        list.deleteAllExceptLast();

        System.out.println("\nFinal list:");
        list.displayList();
    }
}
