package lab4;

// a
public class Node {
    int empNo;
    String name;
    Node left, right;

    public Node(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
        this.left = this.right = null;
    }

    //b
    public void displayNode() {
        System.out.println("Employee Number: " + empNo + ", Name: " + name);
    }
}

