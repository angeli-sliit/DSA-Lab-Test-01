package Q5;

import java.util.Scanner;

class Node {
    int height;
    Node leftChild;
    Node rightChild;

    Node(int h) {
        height = h;
        leftChild = rightChild = null;
    }

    void displayNode() {
        System.out.print(height + " ");
    }
}

class Tree {
    Node root;
    
    
    // Minimum (leftmost node)
    public Node minimum() {
        if (root == null) return null;
        Node current = root;
        while (current.leftChild != null)
            current = current.leftChild;
        return current;
    }

    // Maximum (rightmost node)
    public Node maximum() {
        if (root == null) return null;
        Node current = root;
        while (current.rightChild != null)
            current = current.rightChild;
        return current;
    }

    // Descending order traversal (Right -> Root -> Left)
    public void descendingOrder() {
        descendingHelper(root);
        System.out.println();
    }

    // Insert height into BST
    public void insert(int height) {
        Node newNode = new Node(height);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent;
        while (true) {
            parent = current;
            if (height < current.height) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }


    private void descendingHelper(Node node) {
        if (node != null) {
            descendingHelper(node.rightChild);
            node.displayNode();
            descendingHelper(node.leftChild);
        }
    }
}

public class ChildHeightApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tree heightTree = new Tree();

        System.out.println("Enter the heights of 10 children:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Height " + i + ": ");
            int h = scan.nextInt();
            heightTree.insert(h);
        }

        Node min = heightTree.minimum();
        Node max = heightTree.maximum();

        System.out.println("\nShortest child's height: " + (min != null ? min.height : "Tree is empty"));
        System.out.println("Tallest child's height: " + (max != null ? max.height : "Tree is empty"));

        System.out.print("Heights of all children in descending order: ");
        heightTree.descendingOrder();
        
        scan.close();
    }
}

