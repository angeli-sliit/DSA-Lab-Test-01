package Question03;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkList linkList = new LinkList();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add a new number to the front");
            System.out.println("2. Add a number after a given number");
            System.out.println("3. Delete a number");
            System.out.println("4. Display list");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add at the front: ");
                    int value = scan.nextInt();
                    linkList.insertFirst(value);
                    System.out.print("Updated list: ");
                    linkList.displayLinkList();
                    break;

                case 2:
                    System.out.print("Enter key to insert after: ");
                    int key = scan.nextInt();

                    System.out.print("Enter value to insert: ");
                    int newData = scan.nextInt();

                    boolean inserted = linkList.insertAfter(key, newData);
                    if (!inserted) {
                        System.out.println("Key not found.");
                    }

                    System.out.print("Updated list: ");
                    linkList.displayLinkList();
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    int delKey = scan.nextInt();

                    boolean deleted = linkList.delete(delKey);
                    if (!deleted) {
                        System.out.println("Value not found.");
                    }

                    System.out.print("Updated list: ");
                    linkList.displayLinkList();
                    break;

                case 4:
                    System.out.print("Current list: ");
                    linkList.displayLinkList();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
