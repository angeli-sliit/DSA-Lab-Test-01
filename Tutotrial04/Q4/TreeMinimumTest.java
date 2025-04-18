package Q4;

class Node {
    int iData;         
    double dData;      
    Node leftChild;
    Node rightChild;

    void displayNode() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}

class Tree {
    Node root;
    
    
    // Find minimum value node
    public Node minimum() {
        Node current = root;
        if (current == null) return null;

        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current;
    }

    
    

    // Insert node
    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (id < current.iData) {
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
    }

    // In-order traversal
    public void inOrder() {
        inOrderHelper(root);
        System.out.println();
    }

    private void inOrderHelper(Node localRoot) {
        if (localRoot != null) {
            inOrderHelper(localRoot.leftChild);
            localRoot.displayNode();
            inOrderHelper(localRoot.rightChild);
        }
    }

    // Find node by key
    public Node find(int key) {
        Node current = root;
        while (current != null && current.iData != key) {
            if (key < current.iData) current = current.leftChild;
            else current = current.rightChild;
        }
        return current;
    }
}

public class TreeMinimumTest {
    public static void main(String[] args) {
        Tree myTree = new Tree();

        // Inserting sample nodes
        myTree.insert(280, 1.1);
        myTree.insert(308, 1.2);
        myTree.insert(180, 1.3);
        myTree.insert(416, 1.4);
        myTree.insert(298, 1.5);
        myTree.insert(350, 1.6);
        myTree.insert(156, 1.7);
        myTree.insert(2, 1.8);
        myTree.insert(580, 1.9);
        myTree.insert(275, 2.0);
        myTree.insert(12, 2.1);

        // In-order traversal (ascending order)
        System.out.print("In-order traversal: ");
        myTree.inOrder();
        
        
        // Find minimum
        Node minNode = myTree.minimum();
        if (minNode != null) {
            System.out.print("Minimum key in the tree: ");
            minNode.displayNode();
        } else {
            System.out.println("Tree is empty.");
        }
    }
}
