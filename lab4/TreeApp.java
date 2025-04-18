package lab4;

import java.util.Scanner;

public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();

        
        // i) Insert 10 employees
        tree.insert(149, "Anusha");
        tree.insert(167, "Kosala");
        tree.insert(47, "Dinusha");
        tree.insert(66, "Mihiri");
        tree.insert(159, "Jayani");
        tree.insert(118, "Nimal");
        tree.insert(195, "Nishantha");
        tree.insert(34, "Avodya");
        tree.insert(105, "Bimali");
        tree.insert(133, "Sampath");

        
        // ii) Display tree
        System.out.println("\nIn-order Traversal:");
        tree.inOrder(tree.root);
        System.out.println("\nPre-order Traversal:");
        tree.preOrder(tree.root);
        System.out.println("\nPost-order Traversal:");
        tree.postOrder(tree.root);

        // iii) Search for employee
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter employee number to search: ");
        int searchEmp = scan.nextInt();
        Node result = tree.find(searchEmp);
        if (result != null)
            result.displayNode();
        else
            System.out.println("Employee not found!");

        
        // iv) Delete all nodes
        tree.deleteAll();

        
        
        // v) Display after deletion
        System.out.println("\nTree after deletion:");
        if (tree.root == null) {
            System.out.println("The tree is empty.");
        } else {
            tree.inOrder(tree.root);
        }
        
        scan.close();
    }
}
