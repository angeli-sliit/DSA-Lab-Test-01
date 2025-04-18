package lab4;

//c
public class Tree {
    Node root;

    public void insert(int empNo, String name) {
        Node newNode = new Node(empNo, name);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (empNo < current.empNo) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node find(int empNo) {
        Node current = root;
        while (current != null) {
            if (empNo == current.empNo)
                return current;
            else if (empNo < current.empNo)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }

    //d
    public Node findRecursive(Node node, int empNo) {
        if (node == null || node.empNo == empNo)
            return node;
        if (empNo < node.empNo)
            return findRecursive(node.left, empNo);
        else
            return findRecursive(node.right, empNo);
    }

    //e
    public void deleteAll() {
        root = null;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            node.displayNode();
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            node.displayNode();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            node.displayNode();
        }
    }
}

