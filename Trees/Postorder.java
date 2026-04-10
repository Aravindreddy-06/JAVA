import java.util.*;

class Node{
    char data;
    Node left,right;

    Node(char data){
        this.data = data;
        left = right = null;
    }
}

public class Postorder{
    static Scanner sc = new Scanner(System.in);
    public static Node buildTree(){
        System.out.println("Enter Value (-1 for null): ");
        char val = sc.next().charAt(0);

        if(val == '#') return null;

        Node root = new Node(val);

        System.out.println("Enter Left Child of " + val);
        root.left = buildTree();

        System.out.println("Enter Right Child of " + val);
        root.right = buildTree();

        return root;
    }
    public static void postorder(Node root){
        if(root == null) return;

        postorder(root.right);
        postorder(root.left);
        System.out.print(root.data + " ");
    }

    public static void main(String args[]){
        Node myTree = buildTree();

        System.out.println("PostOrder Traversal: ");
        postorder(myTree);
    }
}