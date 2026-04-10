import java.util.*;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Preorder{
    static Scanner sc = new Scanner(System.in);
    public static Node buildTree(){
        System.out.print("Enter Value (-1 for null): ");
        int val = sc.nextInt();
        if(val == -1) return null;

        Node root = new Node(val);

        System.out.println("Enter Left child of " + val);
        root.left = buildTree();

        System.out.println("Enter Right Child of " + val);
        root.right = buildTree();

        return root;
    }
    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node myTree = buildTree();

        System.out.println("PreOrder Traversal: ");
        preorder(myTree);
    }
}